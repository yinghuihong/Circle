package com.yuyue.circle.presentation.core.injection.modules;

import android.content.Context;

import com.yuyue.circle.data.core.executor.JobExecutor;
import com.yuyue.circle.data.core.rxbus.RxBus;
import com.yuyue.circle.domain.core.executor.PostExecutionThread;
import com.yuyue.circle.domain.core.executor.ThreadExecutor;
import com.yuyue.circle.presentation.core.AndroidApplication;
import com.yuyue.circle.presentation.core.executor.UIThread;
import com.yuyue.circle.presentation.core.navigator.Navigator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * application module
 * Created by yinghuihong on 15/11/18.
 */
@Module
public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    Navigator provideNavigator() {
        return new Navigator();
    }

    @Provides
    @Singleton
    ThreadExecutor provideThreadExecutor() {
        return new JobExecutor();
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread() {
        return new UIThread();
    }

    @Provides
    @Singleton
    RxBus provideRxBus() {
        return new RxBus();
    }
}
