package com.yuyue.circle.presentation.core.view;

/**
 * Created by yinghuihong on 15/12/23.
 */
public interface LoadAndTryView extends LoadDataView {


    /**
     * Show a retry view in case of an error when retrieving data.
     */
    void showRetry();

    /**
     * Hide a retry view shown if there was an error when retrieving data.
     */
    void hideRetry();
}
