package com.yuyue.circle.presentation.core;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.umeng.analytics.MobclickAgent;
import com.yuyue.circle.data.core.config.ApplicationConfig;
import com.yuyue.circle.presentation.core.injection.components.ApplicationComponent;
import com.yuyue.circle.presentation.core.injection.components.DaggerApplicationComponent;
import com.yuyue.circle.presentation.core.injection.modules.ApplicationModule;

import org.litepal.LitePalApplication;


/**
 * Created by yinghuihong on 15/11/18.
 */
public class AndroidApplication extends Application {

    private RefWatcher refWatcher;

    private ApplicationComponent applicationComponent;

    public static RefWatcher getRefWatcher(Context context) {
        AndroidApplication application = (AndroidApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Stetho is a debug bridge for Android applications, enabling the powerful Chrome Developer Tools and much more.
        Stetho.initializeWithDefaults(this);
        // A memory leak detection library for Android and Java.
        this.refWatcher = LeakCanary.install(this);
        // UMeng is a analysis tool.
        MobclickAgent.openActivityDurationTrack(false); // 禁止默认的页面统计方式，这样将不会再自动统计Activity
        // Init dagger2 injector
        this.initializeInjector();
        // LitePal is an Android library that allows developers to use SQLite database extremely easy.
        LitePalApplication.initialize(this);
        // Init SharePreference for all users.
        ApplicationConfig.init(this);
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
