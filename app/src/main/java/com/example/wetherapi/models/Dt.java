package com.example.wetherapi.models;


import com.google.gson.annotations.SerializedName;

public class Dt {
    @SerializedName("dt")
    private long dt;

    public long getDt() {
        return dt;
    }
}