package com.lq.myapplication.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lq.myapplication.R;
import com.lq.myapplication.bean.UserBean;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserBean userBean = new UserBean();
    }
}