package com.yuyue.circle.presentation.bundle.common.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.yuyue.circle.presentation.core.view.adapter.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinghuihong on 16/6/29.
 */
public class MainTabAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragments = new ArrayList<>();
    private final List<String> mFragmentTitles = new ArrayList<>();

    public MainTabAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }
}
