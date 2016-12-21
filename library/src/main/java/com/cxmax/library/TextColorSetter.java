package com.cxmax.library;

import android.widget.TextView;

/**
 * @Author：caixi on 16-12-21 11:31
 * @Description：
 */

public class TextColorSetter extends ViewSetter {

    public TextColorSetter(TextView textView, int color) {
        super(textView, color);
    }

    @Override
    protected void setColor() {
        if (mView == null) return;
        ((TextView) mView).setTextColor(getColor());
    }
}
