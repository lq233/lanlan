package com.lq.myapplication.http;


import com.lq.myapplication.bean.BannerBean;
import com.lq.myapplication.bean.FirstHotBean;
import com.lq.myapplication.bean.FirstRlvBan;
import com.lq.myapplication.bean.WenDaBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiServices {

    //Banner
    @GET("banner/json")
    Observable<BannerBean> getBanner();

    //首页文章
    @GET()
    Observable<FirstRlvBan.DataDTO> getFirst(@Url String Url);

    //首页置顶文章
    @GET("article/top/json")
    Observable<FirstHotBean> getHot();

    @GET()
    Observable<WenDaBean.DataDTO> getWenDa(@Url String page);


}
