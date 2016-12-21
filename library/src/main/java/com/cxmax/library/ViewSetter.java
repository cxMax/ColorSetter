package com.cxmax.library;

import android.graphics.Color;
import android.view.View;

/**
 * @Author：caixi on 16-12-21 11:29
 * @Description：
 */

public abstract class ViewSetter {

    protected View mView;

    protected int mColor = 0;

    public ViewSetter(View view, int color) {
        this.mView = view;
        this.mColor = color;
    }

    protected abstract void setColor();

    protected int getColor() {
        if (mColor == 0) {
            return Color.BLACK;
        }
        return mColor;
    }
}
