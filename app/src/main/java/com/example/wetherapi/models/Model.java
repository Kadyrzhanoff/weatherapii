package com.example.wetherapi.models;

import com.google.gson.annotations.SerializedName;

import java.util.TimeZone;

import kotlin.jvm.internal.SerializedIr;

public class Model {
    @SerializedName("main")
    Main model;

    @SerializedName("wind")
    wind wind_model;

    @SerializedName("sys")
    Sys sys_model;

    @SerializedName("clouds")
    Clouds clouds_model;
    @SerializedName("timezone")
    long timezone;

    public long getTime_zone() {
        return timezone;
    }

    public Main getModel() {
        return model;
    }

    public wind getWind_model() {
        return wind_model;
    }

    public Sys getSys_model() {
        return sys_model;
    }

    public Clouds getClouds_model() {
        return clouds_model;
    }

}