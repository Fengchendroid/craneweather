package com.myandroid.craneweather.gson;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

/**
 * Created by Fengchendroid on 2018/3/6.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Templature templature;
    @SerializedName("cond")
    public More more;

    public class Templature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
