package com.jompons.loggoo.sample.activity.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jompons.loggoo.Loggoo;
import com.jompons.loggoo.sample.R;
import com.jompons.loggoo.sample.activity.MainActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Loggoo.v("Home");
        Loggoo.v(null);
        Loggoo.i("Home");
        Loggoo.i(null);
        Loggoo.d("Home");
        Loggoo.d(null);
        Loggoo.w("Home");
        Loggoo.w(null);
        Loggoo.e("Home");
        Loggoo.e(null);

        Loggoo.v(this, "Home");
        Loggoo.v(this, null);
        Loggoo.i(this, "Home");
        Loggoo.i(this, null);
        Loggoo.d(this, "Home");
        Loggoo.d(this, null);
        Loggoo.w(this, "Home");
        Loggoo.w(this, null);
        Loggoo.e(this, "Home");
        Loggoo.e(this, null);

        Loggoo.d(this, "Class.CanonicalName = "+this.getClass().getCanonicalName());
        Loggoo.d(this, "Class.Name = "+this.getClass().getName());
        Loggoo.d(this, "Class.Package.Name = "+this.getClass().getPackage().getName());
        Loggoo.d(this, "Class.Package.ImplementationTitle = "+this.getClass().getPackage().getImplementationTitle());
        Loggoo.d(this, "Class.Package.SpecificationTitle = "+this.getClass().getPackage().getSpecificationTitle());
        Loggoo.d(this, "PackageName = "+this.getPackageName());
        Loggoo.d(this, "LocalClassName = "+this.getLocalClassName());
        Loggoo.d(this, "ComponentName = "+this.getComponentName());
        Loggoo.d(this, "ComponentName.PackageName = "+this.getComponentName().getPackageName());
        Loggoo.d(this, "ComponentName.ClassName = "+this.getComponentName().getClassName());
        Loggoo.d(this, "ComponentName.ShortClassName = "+this.getComponentName().getShortClassName());
    }
}
