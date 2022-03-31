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
import com.lq.myapplication.adapter.SecondAdapter;
import com.lq.myapplication.bean.WenDaBean;
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

public class SecondFragment extends Fragment {
    private RecyclerView mWendaRlv;

    private SecondAdapter secondAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_second, container, false);
        LogUtils.e("onCreate");
        initView(inflate);
        initData();
        return inflate;
    }

    private void initData() {
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(ALLURL.Url1)
                .build();
        ApiServices apiServices = build.create(ApiServices.class);
        Observable<WenDaBean.DataDTO> wenDa = apiServices.getWenDa("wenda/list/1/json");
        wenDa.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WenDaBean.DataDTO>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WenDaBean.DataDTO datasDTO) {
                        LogUtils.e("" + datasDTO.getCurPage());
                        secondAdapter.addData(datasDTO);
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
        mWendaRlv = (RecyclerView) inflate.findViewById(R.id.wenda_rlv);
        ArrayList<WenDaBean.DataDTO.DatasDTO> dataDTOS = new ArrayList<>();
        secondAdapter = new SecondAdapter(getContext(), dataDTOS);
        mWendaRlv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mWendaRlv.setAdapter(secondAdapter);
    }
}
