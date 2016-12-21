package com.cxmax.library;

import android.view.View;

/**
 * @Author：caixi on 16-12-21 14:07
 * @Description：
 */

public class ViewBackgroundColorSetter extends ViewSetter {

    public ViewBackgroundColorSetter(View view, int color) {
        super(view, color);
    }

    @Override
    protected void setColor() {
        if (mView == null) return;
        mView.setBackgroundColor(getColor());
    }
}
