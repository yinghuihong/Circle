package com.yuyue.circle.presentation.bundle.produce.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuyue.circle.R;
import com.yuyue.circle.presentation.core.view.fragment.BaseFragment;

/**
 * 发活动
 * Created by yinghuihong on 16/6/29.
 */
public class ProduceMainFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.produce_main_fragment, container, false);
        return view;
    }
}
