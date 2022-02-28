package com.lq.myapplication.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.lq.myapplication.R;
import com.lq.myapplication.adapter.MainVpAdapter;
import com.lq.myapplication.fragment.FirstFragment;
import com.lq.myapplication.fragment.FourthFragment;
import com.lq.myapplication.fragment.SecondFragment;
import com.lq.myapplication.fragment.ThirdFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mMainVp;
    private TabLayout mMainTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mMainVp = (ViewPager) findViewById(R.id.main_vp);
        mMainTab = (TabLayout) findViewById(R.id.main_tab);
        initVp();
    }

    private void initVp() {
        //setupWithViewPager不支持自定义
        //自定义需使用addOnTabSelectedListener的方法
        String[] titles = {"首页", "问答", "体系", "我的"};
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());
        fragments.add(new FourthFragment());
        MainVpAdapter mainVpAdapter = new MainVpAdapter(getSupportFragmentManager(), fragments, titles);
        mMainVp.setAdapter(mainVpAdapter);
        mMainTab.setupWithViewPager(mMainVp);
    }
}