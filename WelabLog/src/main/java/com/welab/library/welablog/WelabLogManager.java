package com.welab.library.welablog;

import androidx.annotation.NonNull;

/**
 * Created by pain.xie on 2021/1/23
 */
public class WelabLogManager {
    private WelabLogConfig config;
    private static WelabLogManager manager;

    public WelabLogManager(WelabLogConfig config) {
        this.config = config;
    }

    public static WelabLogManager getInstance() {
        return manager;
    }

    public static void init(@NonNull WelabLogConfig config) {
        manager = new WelabLogManager(config);
    }

    public WelabLogConfig getConfig() {
        return config;
    }
}
