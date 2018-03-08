package com.myandroid.craneweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fengchendroid on 2018/3/6.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
