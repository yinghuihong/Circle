package com.yuyue.circle.presentation.core.injection.components;

import android.app.Activity;


import com.yuyue.circle.presentation.core.injection.ActivityScope;
import com.yuyue.circle.presentation.core.injection.modules.ActivityModule;

import dagger.Component;

/**
 * Created by yinghuihong on 15/11/18.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity activity();
}
