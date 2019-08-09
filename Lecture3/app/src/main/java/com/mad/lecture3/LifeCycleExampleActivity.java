package com.mad.lecture3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleExampleActivity extends AppCompatActivity {

    // called when activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_example);
        Log.d("created_activity", "LifeCycleExampleActivity has been created!");

        // log the values passed from the MainActivity
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            // receive the parameters
            String from = extras.getString("from");
            int lecture = extras.getInt("lecture");

            // log them out to LogCat
            Log.i("from", from);
            Log.i("lecture", "" + lecture);
        }
    }

    // called when activity becomes visible to the user
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("started_activity", "LifeCycleExampleActivity has been started!");
    }

    // called when activity starts interacting with the user
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resumed_activity", "LifeCycleExampleActivity has been resumed!");
    }

    // called when activity is not visible to the user
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("paused_activity", "LifeCycleExampleActivity has been paused!");
    }

    // called when activity is no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stopped_activity", "LifeCycleExampleActivity has been stopped!");
    }

    // called after your activity is stopped, prior to start
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restarted_activity", "LifeCycleExampleActivity has been restarted!");
    }

    // called before the activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroyed_activity", "LifeCycleExampleActivity has been destroyed!");
    }
}
