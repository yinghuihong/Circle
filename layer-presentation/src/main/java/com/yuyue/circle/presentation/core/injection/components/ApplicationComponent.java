package com.yuyue.circle.presentation.core.injection.components;

import android.content.Context;

import com.yuyue.circle.data.core.rxbus.RxBus;
import com.yuyue.circle.domain.core.executor.PostExecutionThread;
import com.yuyue.circle.domain.core.executor.ThreadExecutor;
import com.yuyue.circle.presentation.core.injection.modules.ApplicationModule;
import com.yuyue.circle.presentation.core.navigator.Navigator;
import com.yuyue.circle.presentation.core.view.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 定义暴露的对象列表，此工程暴露给依赖者{@link ActivityComponent}
 * 可定义的对象需正确配置（至少一种）：
 * 1、构造函数带@Inject
 * 2、在Module中定义@Provides method并返回该对象；适用于返回对象为接口类，且实现类不需要配置注解
 * <p>
 * 注入对象在构造函数还包含需要注入的对象，同样也需要以上配置
 * <p>
 * Created by yinghuihong on 15/11/18.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity baseActivity);

    // Exposed to sub-graphs.
    Context getContext();

    Navigator getNavigator();

    ThreadExecutor getThreadExecutor();

    PostExecutionThread getPostExecutionThread();

    RxBus getRxBus();

}
