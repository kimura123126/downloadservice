package com.example.dell1.servicebestpractice;

/**
 * Created by DELL1 on 2019/1/28.
 */

public interface DownloadListener {
    void onProgress(int progress);//通知当前下载进度
    void onSuccess();//通知下载成功事件
    void onFailed();
    void onPaused();
    void onCanceled();
}
