package com.example.servicebestpractice;

public interface DownloadList {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void OnCanceled();
}
