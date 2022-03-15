package com.lq.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lq.myapplication.R;
import com.lq.myapplication.adapter.FirstRlvAdapter;
import com.lq.myapplication.bean.FirstHotBean;
import com.lq.myapplication.http.ALLURL;
import com.lq.myapplication.http.ApiServices;
import com.lq.myapplication.utils.LogUtils;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class FirstFragment extends Fragment {
    private RecyclerView mFirstRlv;
    private FirstRlvAdapter firstRlvAdapter;
    int page = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_first, container, false);
        initView(inflate);
        initData();
        return inflate;
    }

    private void initData() {
        Retrofit build = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(ALLURL.Url).build();
        ApiServices apiServices = build.create(ApiServices.class);
        Observable<FirstHotBean> hot = apiServices.getHot();
        hot.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FirstHotBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(FirstHotBean firstHotBean) {
                        //wanAndroid的首页文章json解析不出来，暂时用热词来代替
                        firstRlvAdapter.addData(firstHotBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void initView(View inflate) {
        mFirstRlv = (RecyclerView) inflate.findViewById(R.id.first_rlv);
        ArrayList<FirstHotBean.DataDTO> datasDTOS = new ArrayList<>();
        firstRlvAdapter = new FirstRlvAdapter(getContext(), datasDTOS);
        mFirstRlv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mFirstRlv.setAdapter(firstRlvAdapter);
    }
}
