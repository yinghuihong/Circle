package com.yuyue.circle.data.core.config;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 存放应用信息
 * Created by yinghuihong on 16/1/26.
 */
public class ApplicationConfig {

    private static SharedPreferences sp;

    public static void init(Context context) {
        sp = context.getApplicationContext().getSharedPreferences("sp_application", Context.MODE_PRIVATE);
    }

    private static synchronized SharedPreferences getPreferences() {
        if (sp == null) {
            throw new NullPointerException("SharedPreferences is null, you should init before use.");
        }
        return sp;
    }

    /**
     * 保存整型值
     */
    public static void putInt(String key, int value) {
        getPreferences().edit().putInt(key, value).apply();
    }

    /**
     * 读取整型值
     */
    public static int getInt(String key) {
        return getPreferences().getInt(key, 0);
    }

    /**
     * 保存长整型
     */
    public static void putLong(String key, long value) {
        getPreferences().edit().putLong(key, value).apply();
    }

    /**
     * 读取长整型
     */
    public static long getLong(String key) {
        return getPreferences().getLong(key, 0L);
    }

    /**
     * 保存布尔值
     */
    public static void putBoolean(String key, Boolean value) {
        getPreferences().edit().putBoolean(key, value).apply();
    }

    /**
     * 读取布尔值
     */
    public static boolean getBoolean(String key, boolean defValue) {
        return getPreferences().getBoolean(key, defValue);
    }

    /**
     * 保存字符串
     */
    public static void putString(String key, String value) {
        getPreferences().edit().putString(key, value).apply();
    }

    /**
     * 读取字符串
     */
    public static String getString(String key) {
        return getPreferences().getString(key, null);
    }

    /**
     * 移除字段
     */
    public static void removeKey(String key) {
        getPreferences().edit().remove(key).apply();
    }

    /**
     * 清空
     */
    public static void clear() {
        getPreferences().edit().clear().apply();
    }

    public interface Key {
        String DOES_AUTO_LOGIN = "does_auto_login";
        String LAST_LOGIN_USER_ID = "last_login_user_id";
        String LAST_LOGIN_ACCOUNT = "last_login_account";
    }
}
