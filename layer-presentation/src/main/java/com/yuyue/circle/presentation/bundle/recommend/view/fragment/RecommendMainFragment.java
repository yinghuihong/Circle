package com.yuyue.circle.presentation.bundle.recommend.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuyue.circle.R;
import com.yuyue.circle.presentation.core.view.fragment.BaseFragment;

/**
 * 精彩推荐
 * Created by yinghuihong on 16/6/29.
 */
public class RecommendMainFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.recommend_main_fragment, container, false);
        return view;
    }
}
