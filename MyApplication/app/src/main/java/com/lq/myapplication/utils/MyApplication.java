package com.lq.myapplication.utils;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication myApplication;

    //全局唯一
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.d("myApplication  onCreate");
        myApplication = this;
        ContextHelper.setContext(this);
    }

    public static MyApplication getInstance() {
        return myApplication;
    }
}
