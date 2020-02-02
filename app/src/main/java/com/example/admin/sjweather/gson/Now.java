package com.example.admin.sjweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2020/2/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
