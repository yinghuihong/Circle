package com.yuyue.circle.presentation.core.view.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by yinghuihong on 16/5/20.
 */
public class NoScrollListView extends GridView {
    public NoScrollListView(Context context) {
        super(context);

    }

    public NoScrollListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
