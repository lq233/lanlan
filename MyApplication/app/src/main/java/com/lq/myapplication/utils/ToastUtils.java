package com.lq.myapplication.utils;

import android.widget.Toast;

public class ToastUtils {

    public static void showShort(int resId) {
        Toast.makeText(ContextHelper.getContext(), resId, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(int resId) {
        Toast.makeText(ContextHelper.getContext(), resId, Toast.LENGTH_LONG).show();
    }
}
