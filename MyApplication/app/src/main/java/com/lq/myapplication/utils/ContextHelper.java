package com.lq.myapplication.utils;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class ContextHelper {

    private static final String TAG = "ContextHelper";

    private static Context sApplicationContext;


    private static class Holder {

        private static ContextHelper sHolder = new ContextHelper();
    }

    public static ContextHelper getInstance() {
        return Holder.sHolder;
    }


    /**
     * 初始化context，如果由于不同机型导致反射获取context失败可以在Application调用此方法
     *
     * @param context
     */
    public static void setContext(Context context) {
        sApplicationContext = context;
    }

    /**
     * 获取应用ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (sApplicationContext == null) {
            try {
                Application application = (Application) Class.forName("android.app.ActivityThread")
                        .getMethod("currentApplication").invoke(null, (Object[]) null);
                if (application != null) {
                    sApplicationContext = application;
                    return application;
                }
            } catch (Exception e) {
                Log.e("ContextHolder", "Exception:" + Log.getStackTraceString(e));
            }

            try {
                Application application = (Application) Class.forName("android.app.AppGlobals")
                        .getMethod("getInitialApplication").invoke(null, (Object[]) null);
                if (application != null) {
                    sApplicationContext = application;
                    return application;
                }
            } catch (Exception e) {
                Log.e("ContextHolder", "Exception:" + Log.getStackTraceString(e));
            }

            throw new IllegalStateException(
                    "ContextHolder is not initialed, it is recommend to init with application context.");
        }
        return sApplicationContext;
    }
}
