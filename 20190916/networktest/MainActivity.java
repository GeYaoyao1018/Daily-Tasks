package com.example.networktest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.VoiceInteractor;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextLinks;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.ContentHandler;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import javax.xml.parsers.SAXParserFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     TextView responseText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendRequest = (Button) findViewById(R.id.send_request);
        responseText = (TextView) findViewById(R.id.response_text);
        sendRequest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.send_request) {
           // sendRequestWithHttpURLConnection();
            sendRequestWith0kHttp();
        }
    }
   /* private void sendRequestWithHttpURLConnection()  {
        new Thread((new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try {
                    URI url = new URL("http://www.baidu.com");
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    connection.setReadTimeout(0000);
                    InputStream in = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null ) {
                        response.append(line);
                    }
                    showResponse(response.toString());
                } catch (Exception e)  {
                    e.printStackTrace();
                }  finally {
                    if (reader !=null)  {
                        try  {
                            reader.close();
                        }catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        }).start();*/

        private void sendRequestWith0kHttp() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        OkHttpClient client = new OkHttpClient();
                        Request request = new Request.Builder()
                                //指定访问的服务器地址是本机电脑
                                .url("http://10.0.2.2/get_data.xml")
                                .build();
                        Response response = client.newCall(request).execute();
                        String responseData = response.body().string();
                        //  parseXMLWithPulL(responseData);
                        parseXMLWithSAX(responseData)
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).strat();
        }
        private void   parseXMLWithSAX(String xmlData) {
            try {
                SAXParserFactory factory = SAXParserFactory.newInstance();
                XMLReader xmlReader = factory.newSAXParser().getXMLReader();
                ContentHandler handler = new ContentHandler();

                xmlReader.setContentHandler(handler);

                xmlReader.setContentHandler(handler);

                xmlReader.parse(new InputSource(new StringReader(xmlData)));
            } catch (Exception e) {
                e.printStackTrace();
            }


            private void parseXMLWithPull (String xmlData){
                try {
                    XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
                    XmlPullParser xmlPullParser = factory.newPullParser();
                    xmlPullParser.setInput(new StringReader(xmlData));
                    int eventType = xmlPullParser.getEventType();
                    String id = "";
                    String name = "";
                    String version = "";
                    while (eventType != XmlPullParser.END_DOCUMENT) {
                        String nodeName = xmlPullParser.getName();
                        switch (eventType) {
                            //开始解析某个节点
                            case XmlPullParser.START_TAG: {
                                if ("id".equals(nodeName)) {
                                    id = xmlPullParser.nextText();
                                } else if ("name".equals(nodeName)) {
                                    name = xmlPullParser.nextText();
                                } else if ("version".equals(nodeName)) {
                                    version = xmlPullParser.nextText();
                                }
                                break;
                                ;
                            }
                            //完成解析某个节点

                            case XmlPullParser.END_TAG: {
                                if ("app".equals(nodeName)) {
                                    Log.d("MainActivity", "id is " + id);
                                    Log.d("Mainactivity", "name is " + name);
                                    Log.d("Maincativity", "version is " + version);
                                }
                                break;
                            }
                            default:
                                break;
                        }
                        eventType = xmlPullParser.next();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

   /* private void showResponse(final String response_) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                responseText.setText(response_);
            }
        });
    }
}  */

