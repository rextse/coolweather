package com.xxr.coolweather.util;

/**
 * Created by Administrator on 2015/8/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
