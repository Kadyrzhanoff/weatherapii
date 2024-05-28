package com.example.wetherapi.models;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {
    @SerializedName("icon")
    private String icon;

    @SerializedName("cod")
    private Integer cod;
}
