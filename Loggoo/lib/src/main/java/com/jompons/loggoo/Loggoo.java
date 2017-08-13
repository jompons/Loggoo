package com.jompons.loggoo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.ACTIVITY_SERVICE;

/**
 * Created by Jompon on 8/13/2017.
 */

public class Loggoo{

    /**
     * Length
     * 0: Simple Name is just the name of class
     * 1: Local Class Name is the path of class name after original package name
     * 2: Original Package Name
     * 3: The package name full path which's not including class name
     * 4: The package name full path
     */
    private static Loggoo loggoo;
    private Context context;
    private static String mApplicationName;
    private static int mLength;
    public static class Builder {

        private Context context;
        private List<String> permissions;
        private int length;
        public Builder(Context context) {
            this.context = context;
            this.permissions = new ArrayList<>();
        }

        public Builder add(String permission) {
            permissions.add(permission);
            return this;
        }

        public Builder length(int length)
        {
            this.length = length;
            return this;
        }

        public Builder build() {
            return this;
        }
    }

    private Loggoo(Builder builder)
    {
        context = builder.context;
    }

    public static void initialize(Builder builder)
    {
        if( loggoo == null )    loggoo = new Loggoo(builder);
        mApplicationName = getClassName(builder.context, builder.length);
        mLength = builder.length;
    }

    private static String getClassName(Context context)
    {
        ActivityManager am = (ActivityManager) context.getSystemService(ACTIVITY_SERVICE);
        List< ActivityManager.RunningTaskInfo > taskInfo = am.getRunningTasks(1);
        return taskInfo.get(0).topActivity.getClassName();
    }

    private static String getName(Context context)
    {
        return getClassName(context, mLength);
    }

    private static String getClassName(Context context, int length)
    {
        if( length == 0 )   return context.getClass().getSimpleName();
        if( length == 1 ){
            String packageName = context.getPackageName();
            String fullClassName = context.getClass().getName();
            return fullClassName.substring(fullClassName.indexOf(packageName)+packageName.length()+1, fullClassName.length());
        }
        if( length == 2 )   return context.getPackageName();
        if( length == 3 )   return context.getClass().getPackage().getName();
        if( length == 4 )   return context.getClass().getName();
        return context.getClass().getSimpleName();
    }

    public static String getApplicationName(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int stringId = applicationInfo.labelRes;
        return stringId == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(stringId);
    }

    public static void v(String message)
    {
        Log.v(mApplicationName, message+"");
    }

    public static void d(String message)
    {
        Log.d(mApplicationName, message+"");
    }

    public static void i(String message)
    {
        Log.i(mApplicationName, message+"");
    }

    public static void w(String message)
    {
        Log.w(mApplicationName, message+"");
    }

    public static void e(String message)
    {
        Log.e(mApplicationName, message+"");
    }

    public static void wtf(String message)
    {
        Log.wtf(mApplicationName, message+"");
    }

    public static void v(Context context, String message)
    {
        Log.v(getClassName(context), message+"");
    }

    public static void d(Context context, String message)
    {
        Log.d(getClassName(context), message+"");
    }

    public static void i(Context context, String message)
    {
        Log.i(getClassName(context), message+"");
    }

    public static void w(Context context, String message)
    {
        Log.w(getClassName(context), message+"");
    }

    public static void e(Context context, String message)
    {
        Log.e(getClassName(context), message+"");
    }

    public static void wtf(Context context, String message)
    {
        Log.wtf(getClassName(context), message+"");
    }

    public static void v(String tag, String message)
    {
        Log.v(tag, message+"");
    }

    public static void d(String tag, String message)
    {
        Log.d(tag, message+"");
    }

    public static void i(String tag, String message)
    {
        Log.i(tag, message+"");
    }

    public static void w(String tag, String message)
    {
        Log.w(tag, message+"");
    }

    public static void e(String tag, String message)
    {
        Log.e(tag, message+"");
    }

    public static void wtf(String tag, String message)
    {
        Log.wtf(tag, message+"");
    }
}
