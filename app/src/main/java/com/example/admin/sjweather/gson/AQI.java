package com.example.admin.sjweather.gson;

/**
 * Created by admin on 2020/2/2.
 */

public class AQI {
    public AQICity city;
    
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
