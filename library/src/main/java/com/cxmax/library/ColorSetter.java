package com.cxmax.library;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author：caixi on 16-12-21 11:17
 * @Description： 构建一个简单的链式调用, 来设置所有view的颜色, 就不用每次单独去setTextColor
 * usage: new ColorSetter.Builder(getActivity())
 *            .textColor(textView , color)
 *            .textColor(R.id.text , color)
 *            .create()
 *            .setColor();
 */

public class ColorSetter {

    Builder mBuilder;

    public ColorSetter(Builder builder) {
        this.mBuilder = builder;
    }

    public void setColor() {
        if (mBuilder == null) {
            throw new NullPointerException("builder can not be null");
        }
        mBuilder.setColor();
    }

    public static class Builder {

        Set<ViewSetter> mElements = new HashSet<>();

        Activity mActivity;

        public Builder(Activity activity) {
            this.mActivity = activity;
        }

        public Builder(Context context) {
            if (context == null) {
                throw new NullPointerException("context can not be null");
            }
            if (context instanceof Activity){
                this.mActivity = (Activity) context;
            }
        }

        public Builder(Fragment fragment) {
            if (fragment == null) {
                throw new NullPointerException("fragment can not be null");
            }
            this.mActivity = fragment.getActivity();
        }

        private View findViewById(int viewId) {
            if (mActivity == null){
                throw new NullPointerException("activity can not be null");
            }
            return mActivity.findViewById(viewId);
        }

        public Builder textColor(int viewId, int color) {
            TextView textView = (TextView) findViewById(viewId);
            mElements.add(new TextColorSetter(textView, color));
            return this;
        }

        public Builder textColor(TextView textView, int color) {
            mElements.add(new TextColorSetter(textView, color));
            return this;
        }

        public Builder backgroundColor(int viewId, int color) {
            mElements.add(new ViewBackgroundColorSetter(findViewById(viewId),
                    color));
            return this;
        }

        public Builder backgroundColor(View view, int color) {
            mElements.add(new ViewBackgroundColorSetter(view,
                    color));
            return this;
        }

        public Builder backgroundDrawable(int viewId, int color) {
            mElements.add(new ViewBackgroundDrawableSetter(findViewById(viewId), color));
            return this;
        }

        public Builder backgroundDrawable(View view, int color) {
            mElements.add(new ViewBackgroundDrawableSetter(view, color));
            return this;
        }

        public ColorSetter create() {
            return new ColorSetter(this);
        }

        private void setColor() {
            for (ViewSetter viewSetter : mElements) {
                viewSetter.setColor();
            }
        }
    }
}
