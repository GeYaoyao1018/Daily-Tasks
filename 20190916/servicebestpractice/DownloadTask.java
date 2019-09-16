package com.example.servicebestpractice;

import android.app.DownloadManager;
import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Environment;
import android.renderscript.ScriptGroup;
import android.view.textclassifier.TextLinks;
import android.webkit.DownloadListener;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class DownloadTask extends AsyncTask<String, Integer,Integer> {

    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_FAILED = 1;
    public static final int TYPE_PAUSED = 2;
    public static final int TYPE_CANCELED = 3;

    private DownloadListener Listener;
    private boolean isCanceled = false;
    private boolean isPaused = false;
    private int lastProgress;

    public DownloadTask(DownloadListener listener) {
        this.Listener = listener;
    }

    @Override
    protected Integer doInBackground(String... params) {
        InputStream is = null;
        RandomAccessFile savedFile = null;
        File file = null;
        try {
            long downloadedLength = 0; // 记录已下载的文件长度
            String downloadUrl = params[0];
            String filename = downloadUrl.substring(downloadUrl.lastIndexOf("/"));
            String directory = Environment.getExternalStoragePublicDirectory
                    (Environment.DIRECTORY_DOWNLOADS).getPath();
            file = new File(directory + filename);
            if (file.exists()) {
                downloadedLength = file.length();
            }
            long contentLength = getContentLength(downloadUrl);
            if (contentLength == 0) {
                return TYPE_FAILED;
            } else if (contentLength == downloadedLength) {
                //已下载的字节和文件总字节相等,说明已经下载完成了
                return TYPE_SUCCESS;
            }
            OKHttpClient client = new OKHttpClient();
            Request request = new Request.Builder()
                    //断点下载,自定从哪个字节开始下载
                    .addHeader("RANGE", "bytes=" + downloadedLength + "_")
                    .url(downloadUrl)
                    .build();
            Response response = client.newCall(request).execute();
            if (response != null) {
                is = response.body().byteStream();
                savedFile = new RandomAccessFile(file, "rw");
                savedFile.seek(downloadedLength);  //跳过已下载的字节
                byte[] b = new byte[1024];
                int total = 0;
                int len;
                while (len = is.read(b) != -1) {
                    if (isCanceled) {
                        return TYPE_CANCELED;
                    } else if (isPaused) {
                        return TYPE_PAUSED;
                    } else {
                        total += len;
                        savedFile.write(b, 0, len);
                        //计算已下载的百分比
                        int progress = (int) ((total + downloadedLength) * 100 /
                                contentLength);
                        publishProgress(progress);
                    }
                }

                response.body().close();
                return TYPE_SUCCESS;
            }
        } catch (Exception e) {
            return TYPE_SUCCESS;
        }
    } finally

    {
        try {
            if (is != null) {
                is.close();
            }

            if (savedFile != null) {
                savedFile.close();
            }
            if (isCanceled && file != null) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return TYPE_FAILED;
}

    @Override
    protected void onProgressUpdate(Integer... values) {
        int progress = values[0];
        if (progress > lastProgress) {
            Listener.onProgress(progress);
            lastProgress = progress;
    }
}

    @Override
    protected void onPostExecute(Integer status) {
       switch (status)  {
           case TYPE_SUCCESS:
               Listener.onSuccess();
               break;
           case  TYPE_FAILED:
               Listener.onFailed();
               break;
           case TYPE_PAUSED:
               Listener.onPaused();
               break;

           case TYPE_CANCELED:
               Listener.onCanceled();
               default:
                   break;
    }
}
    public void pauseDownload()   {
    isPaused = true;
}

   public void cancleDownload() {
    isCanceled = true;
   }

   private long getContentLength(String downloadUrl)  throws IOException  {
    OKHttpClient client = new OKHttpClient();
    Request request = new Request.Builder()
            .url(downloadUrl)
            .build();
    Response response = client.newCall(request).execute();
    if (response != null && response.isSuccessful())  {
        long contentLength =  response.body().contentLength();
        response.close();
        return contentLength;
    }
    return 0;
}
}




