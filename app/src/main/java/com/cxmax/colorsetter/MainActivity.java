package com.cxmax.colorsetter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cxmax.library.ColorSetter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorSet();
    }

    private void colorSet() {
        new ColorSetter.Builder(this)
                .textColor(R.id.tv , Color.BLUE)
                .create()
                .setColor();
    }
}
