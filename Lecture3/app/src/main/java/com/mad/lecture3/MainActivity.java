package com.mad.lecture3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button lifeCycleBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifeCycleBTN = findViewById(R.id.lifeCycleBTN);

        // listen for clicks on the lifeCycleBTN
        lifeCycleBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLifeCycleExampleActivity();
            }
        });
    }

    // open the LifeCycleExampleActivity
    private void openLifeCycleExampleActivity() {
        // create an intent from this Activity to the LifeCycleExampleActivity
        Intent lifeCycleIntent = new Intent(this, LifeCycleExampleActivity.class);

        // pass data to send the LifeCycleExampleActivity when opening it
        lifeCycleIntent.putExtra("from", "MainActivity");
        lifeCycleIntent.putExtra("lecture", 3);

        // start the LifeCycleExampleActivity
        startActivity(lifeCycleIntent);
    }
}
