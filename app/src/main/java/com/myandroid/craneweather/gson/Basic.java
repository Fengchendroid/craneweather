package com.myandroid.craneweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fengchendroid on 2018/3/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
