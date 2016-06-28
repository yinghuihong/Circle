package com.yuyue.circle.data.core.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * 存放用户个人信息
 * Created by yinghuihong on 16/1/26.
 */
public class UserConfig {

    private static SharedPreferences sp;

    public static void init(Context context, String name) {
        if (TextUtils.isEmpty(name)) {
            throw new NullPointerException("Init SharePreferences fail, user identify is null");
        }
        sp = context.getApplicationContext().getSharedPreferences("sp_user_" + name, Context.MODE_PRIVATE);
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

        /**
         * 当前USER_ID同USER_ACCOUNT,因为后台没有返回USER_ID
         */
        String COMMON_USER_ID = "common_user_id";
        String COMMON_USER_ACCOUNT = "common_user_account";
        String COMMON_TOKEN = "common_token";
        String COMMON_USER_TOKEN = "common_user_token";
        String COMMON_REFRESH_INTERVAL_TIME = "common_refresh_interval_time";
        String COMMON_LAST_REFRESH_TIME = "common_last_refresh_time";
        String COMMON_USER_NICKNAME = "common_user_nickname";
        String COMMON_USER_PORTRAIT = "common_user_portrait";

        String OTT_LAST_UPDATE_TIME_FOR_COLUMNS_BY_ = "ott_last_update_time_for_columns_by_";
        String OTT_LAST_UPDATE_TIME_FOR_FLOORS = "ott_last_update_time_for_floors";

        String SETTING_ALLOW_IN_NOT_WIFI = "setting_allow_in_not_wifi";
        String SETTING_AUTO_DISCOVER_DEVICE = "setting_auto_discover_device";
        String SETTING_SHOW_RC_FLOAT_WINDOW = "setting_show_rc_float_window";

    }
}
