package com.cxmax.library;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

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
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(getColor());
        mView.setBackground(drawable);
    }
}
