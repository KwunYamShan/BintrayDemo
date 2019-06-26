package com.wh.bintraylib;

import android.content.Context;
import android.widget.Toast;

/**
 * @author KwunYamShan.
 * @time 2019/6/17.
 * @explain
 */
public class BintrayUtil {
    public static void showToast(Context context) {
        Toast.makeText(context, "Bintray~", Toast.LENGTH_SHORT).show();
    }
}
