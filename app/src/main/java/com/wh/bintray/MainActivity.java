package com.wh.bintray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wh.bintraylib.BintrayUtil;

/**
 * @author KwunYamShan.
 * @time 2019/6/17.
 * @explain
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BintrayUtil.showToast(this);
    }
}
