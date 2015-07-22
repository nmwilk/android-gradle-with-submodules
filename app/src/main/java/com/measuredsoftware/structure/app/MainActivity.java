package com.measuredsoftware.structure.app;

import android.app.Activity;
import android.os.Bundle;
import com.measuredsoftware.mymodule.lib.ParcelableMyClass;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ParcelableMyClass myClass = new ParcelableMyClass(2);
    }
}
