package com.example.wetherapi.models;

import com.google.gson.annotations.SerializedName;

public class wind {
    @SerializedName("speed")
    private double speed;

    public double getSpeed() {
        return speed;
    }
}