package com.welab.library.welablog;

/**
 * Created by pain.xie on 2021/1/23
 */
public abstract class WelabLogConfig {
    public String getTag() {
        return "WelabLog";
    }

    public boolean enable() {
        return true;
    }
}
