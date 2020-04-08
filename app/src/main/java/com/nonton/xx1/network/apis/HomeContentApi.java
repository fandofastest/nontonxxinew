package com.nonton.xx1.network.apis;

import com.nonton.xx1.models.home_content.HomeContent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface HomeContentApi {

    @GET("home_content_for_android")
    Call<HomeContent> getHomeContent(@Header("API-KEY") String apiKey);
}
