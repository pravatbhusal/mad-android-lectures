package com.mad.lecture2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button clickMeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link the clickMeBTN variable in Java to the clickMeBTN to the activity_main.xml layout
        clickMeBTN = findViewById(R.id.clickMeBTN);

        // listen for clicks on the clickMeBTN
        clickMeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printHelloWorld();
            }
        });
    }

    // log "Hello World" to logcat
    private void printHelloWorld() {
        Log.d("helloWorld", "Hello World");
    }
}
