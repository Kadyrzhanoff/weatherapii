package com.example.wetherapi.remote_data;

import com.example.wetherapi.models.Model;
import com.example.wetherapi.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("/data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);

    @GET("/data/2.5/weather?&appid=cb3b5c9acd78992f256d1408f9900a2b")
    Call<WeatherModel> getWeather(
            @Query("q") String name);

    String url="cb3b5c9acd78992f256d1408f9900a2b";
}
