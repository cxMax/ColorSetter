package com.cxmax.library;

import android.view.View;

import com.meizu.cloud.app.utils.ImageUtil;

/**
 * @Author：caixi on 16-12-21 14:08
 * @Description：
 */

public class ViewBackgroundDrawableSetter extends ViewSetter {

    public ViewBackgroundDrawableSetter(View view, int color) {
        super(view, color);
    }

    @Override
    protected void setColor() {
        if (mView == null) return;
        mView.setBackground(ImageUtil.gainColorDrawable(getColor()));
    }
}
