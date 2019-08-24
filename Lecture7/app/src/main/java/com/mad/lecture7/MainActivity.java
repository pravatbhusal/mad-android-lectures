package com.mad.lecture7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // receive the SharedPreferences and its Editor for "Lecture7" using private mode (0)
        SharedPreferences pref = getApplicationContext().getSharedPreferences("Lecture7", 0);
        Editor editor = pref.edit();

        // store a String called "name" with value "Pravat Bhusal"
        editor.putString("name", "Pravat Bhusal");

        // store an integer called "age" with value 19
        editor.putInt("age", 19);

        // commit changes
        editor.commit();

        // retrieve the String key "name", use a default value of null
        String name = pref.getString("name", null);
        Log.d("name1", name);

        // remove the "name" key, then commit changes
        editor.remove("name");
        editor.commit();

        // now try and retrieve the String key "name", it should return the default value of null
        name = pref.getString("name", null);
        Log.d("name2", name);

        // clear all data, then commit changes
        editor.clear();
        editor.commit();
    }
}
