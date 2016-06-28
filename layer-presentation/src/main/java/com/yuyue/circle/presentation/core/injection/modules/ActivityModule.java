package com.yuyue.circle.presentation.core.injection.modules;

import android.app.Activity;

import com.yuyue.circle.presentation.core.injection.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yinghuihong on 15/11/18.
 */
@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Activity provideActivity() {
        return this.activity;
    }

}
