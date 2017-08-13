package com.jompons.loggoo.sample;

import android.Manifest;
import android.app.Application;

import com.jompons.loggoo.Loggoo;

/**
 * Created by Jompon on 8/13/2017.
 */

public class LoggooSampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Loggoo.initialize(
                new Loggoo.Builder(this)
                        .add(Manifest.permission.ACCESS_COARSE_LOCATION)
                        .add(Manifest.permission.CALL_PHONE)
                        .add(Manifest.permission.CAMERA)
                        .add(Manifest.permission.READ_CONTACTS)
                        .add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        .length(4)
                        .build());

        Loggoo.d("Class.CanonicalName = "+this.getClass().getCanonicalName());
        Loggoo.d("Class.Name = "+this.getClass().getName());
        Loggoo.d("Class.Package.Name = "+this.getClass().getPackage().getName());
        Loggoo.d("Class.Package.ImplementationTitle = "+this.getClass().getPackage().getImplementationTitle());
        Loggoo.d("Class.Package.SpecificationTitle = "+this.getClass().getPackage().getSpecificationTitle());
        Loggoo.d("PackageName = "+this.getPackageName());
    }
}
