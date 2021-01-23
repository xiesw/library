package com.welab.library.welablog;

import android.util.Log;

import androidx.annotation.NonNull;

/**
 * Created by pain.xie on 2021/1/23
 */
public class WelabLog {
    public static void v(Object... contents) {
        WelabLog.v(WelabLogType.V, contents);
    }

    public static void vt(String tag, Object... contents) {
        WelabLog.v(WelabLogType.V, tag, contents);
    }

    public static void d(Object... contents) {
        WelabLog.v(WelabLogType.D, contents);
    }

    public static void dt(String tag, Object... contents) {
        WelabLog.v(WelabLogType.D, tag, contents);
    }

    public static void i(Object... contents) {
        WelabLog.v(WelabLogType.I, contents);
    }

    public static void it(String tag, Object... contents) {
        WelabLog.v(WelabLogType.I, tag, contents);
    }

    public static void w(Object... contents) {
        WelabLog.v(WelabLogType.V, contents);
    }

    public static void wt(String tag, Object... contents) {
        WelabLog.v(WelabLogType.V, tag, contents);
    }

    public static void e(Object... contents) {
        WelabLog.v(WelabLogType.E, contents);
    }

    public static void et(String tag, Object... contents) {
        WelabLog.v(WelabLogType.E, tag, contents);
    }

    public static void a(Object... contents) {
        WelabLog.v(WelabLogType.A, contents);
    }

    public static void at(String tag, Object... contents) {
        WelabLog.v(WelabLogType.A, tag, contents);
    }

    public static void v(@WelabLogType.TYPES int type, Object... contents) {
        WelabLog.v(type, WelabLogManager.getInstance().getConfig().getTag(), contents);
    }

    public static void v(@WelabLogType.TYPES int type, @NonNull String tag, Object... contents) {
        WelabLog.v(WelabLogManager.getInstance().getConfig(), type, tag, contents);
    }

    public static void v(@NonNull WelabLogConfig config, @WelabLogType.TYPES int type, @NonNull String tag, Object... contents) {
        if (config == null) {
            Log.e("WelabLog", "请init()");
            return;
        }

        if (!config.enable()) {
            return;
        }

        String body = parseContents(contents);
        Log.println(type, tag, body);
    }

    private static String parseContents(Object... contents) {
        StringBuffer sb = new StringBuffer();
        for (Object content : contents) {
            sb.append(content.toString());
            sb.append(";");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
