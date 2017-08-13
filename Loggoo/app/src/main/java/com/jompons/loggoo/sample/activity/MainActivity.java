package com.jompons.loggoo.sample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jompons.loggoo.Loggoo;
import com.jompons.loggoo.sample.R;
import com.jompons.loggoo.sample.activity.test.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        Loggoo.v("This is VERBOSE!!");
        Loggoo.v(null);
        Loggoo.d("This is DEBUG!!");
        Loggoo.d(null);
        Loggoo.i("This is INFO!!");
        Loggoo.i(null);
        Loggoo.w("This is WARN!!");
        Loggoo.w(null);
        Loggoo.e("This is ERROR!!");
        Loggoo.e(null);
        Loggoo.wtf("This is ASSERT!!");
        Loggoo.wtf(null);

        Loggoo.v(this, "This is VERBOSE!!");
        Loggoo.v(this, null);
        Loggoo.d(this, "This is DEBUG!!");
        Loggoo.d(this, null);
        Loggoo.i(this, "This is INFO!!");
        Loggoo.i(this, null);
        Loggoo.w(this, "This is WARN!!");
        Loggoo.w(this, null);
        Loggoo.e(this, "This is ERROR!!");
        Loggoo.e(this, null);
        Loggoo.wtf(this, "This is ASSERT!!");
        Loggoo.wtf(this, null);

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
