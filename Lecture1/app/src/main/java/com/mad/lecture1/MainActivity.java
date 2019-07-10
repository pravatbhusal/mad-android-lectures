package com.mad.lecture1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // print out "Hello World" onto the Java console
        System.out.println("Hello World");

        // print out "Hello World" onto Logcat, don't forget to run the app in "Debug" mode
        Log.d("helloWorld", "Hello World!");
    }
}
