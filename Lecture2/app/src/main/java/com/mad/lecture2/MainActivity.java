package com.mad.lecture2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clickMeBTN;
    private TextView msgText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link the clickMeBTN variable in Java to the clickMeBTN in the activity_main.xml layout
        clickMeBTN = findViewById(R.id.clickMeBTN);

        // link the msgText variable in Java to the msgText in the activity_main.xml layout
        msgText = findViewById(R.id.msgText);

        // listen for clicks on the clickMeBTN
        clickMeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayGoodbye();
            }
        });
    }

    // change the message text to "Goodbye World"
    private void sayGoodbye() {
        msgText.setText(R.string.goodbye_world);
    }
}
