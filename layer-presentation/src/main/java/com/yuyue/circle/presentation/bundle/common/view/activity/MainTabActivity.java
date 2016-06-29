package com.yuyue.circle.presentation.bundle.common.view.activity;

import android.os.Bundle;
import android.view.View;

import com.yuyue.circle.R;
import com.yuyue.circle.presentation.bundle.common.view.adapter.MainTabAdapter;
import com.yuyue.circle.presentation.bundle.discover.view.fragment.DiscoverMainFragment;
import com.yuyue.circle.presentation.bundle.mine.view.fragment.MineMainFragment;
import com.yuyue.circle.presentation.bundle.produce.view.fragment.ProduceMainFragment;
import com.yuyue.circle.presentation.bundle.recommend.view.fragment.RecommendMainFragment;
import com.yuyue.circle.presentation.core.view.activity.BaseActivity;
import com.yuyue.circle.presentation.core.view.component.ScrollCustomViewPager;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主操作页面
 */
public class MainTabActivity extends BaseActivity {

    @Bind(R.id.view_pager)
    ScrollCustomViewPager mViewPager;

    @OnClick({R.id.btn_recommend, R.id.btn_discover, R.id.btn_produce, R.id.btn_mine})
    void click(View view) {
        int index = Integer.valueOf((String) view.getTag());
        mViewPager.setCurrentItem(index, false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_main_tab_activity);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        MainTabAdapter adapter = new MainTabAdapter(getSupportFragmentManager());
        adapter.addFragment(new RecommendMainFragment(), getString(R.string.common_main_tab_recommend));
        adapter.addFragment(new DiscoverMainFragment(), getString(R.string.common_main_tab_discover));
        adapter.addFragment(new ProduceMainFragment(), getString(R.string.common_main_tab_produce));
        adapter.addFragment(new MineMainFragment(), getString(R.string.common_main_tab_mine));
        mViewPager.setAdapter(adapter);
        mViewPager.setCurrentItem(0);
    }
}
