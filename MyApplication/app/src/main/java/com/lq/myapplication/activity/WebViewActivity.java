package com.lq.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.lq.myapplication.R;
import com.lq.myapplication.utils.LogUtils;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWebTv;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        LogUtils.e(url);
        initView();
    }

    private void initView() {
        mWebTv = (WebView) findViewById(R.id.webTv);
        WebSettings settings = mWebTv.getSettings();
        settings.setJavaScriptEnabled(true);
        mWebTv.setWebViewClient(new WebViewClient());
        mWebTv.loadUrl(url);
    }
}