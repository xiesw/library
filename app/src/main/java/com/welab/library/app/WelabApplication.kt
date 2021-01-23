package com.welab.library.app

import android.app.Application
import com.welab.library.welablog.WelabLogConfig
import com.welab.library.welablog.WelabLogManager

/**
 * Created by pain.xie on 2021/1/23
 */

public class WelabApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        WelabLogManager.init(object : WelabLogConfig() {
            override fun getTag(): String {
                return "WelabLog";
            }

            override fun enable(): Boolean {
                return true;
            }
        })
    }
}