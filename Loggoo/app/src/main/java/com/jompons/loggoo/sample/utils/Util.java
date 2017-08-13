package com.jompons.loggoo.sample.utils;

import com.jompons.loggoo.Loggoo;

/**
 * Created by Jompon on 8/13/2017.
 */

public class Util {

    private static final String TAG = Util.class.getSimpleName();
    public static void println(String message)
    {
        Loggoo.v(TAG, message);
        Loggoo.d(TAG, message);
        Loggoo.i(TAG, message);
        Loggoo.w(TAG, message);
        Loggoo.e(TAG, message);
        Loggoo.wtf(TAG, message);
    }
}
