package com.lq.myapplication.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MainVpAdapter extends FragmentPagerAdapter {
    //Fragment个数少的时候建议使用page体验好，数目多的时候建议使用statepage
    // 定义Fragment列表来存放Fragment
    private List<Fragment> mfragmentList;
    private String[] mTitles;

    public MainVpAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList, String[] Titles) {
        super(fm);
        this.mfragmentList = fragmentList;
        this.mTitles = Titles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
