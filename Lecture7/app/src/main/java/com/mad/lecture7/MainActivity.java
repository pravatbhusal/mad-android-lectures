package com.mad.lecture7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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
        SharedPreferences pref = getApplicationContext().getSharedPreferences("Lecture7", Context.MODE_PRIVATE);
        Editor editor = pref.edit();

        // store a String called "name" with value "Pravat Bhusal"
        editor.putString("name", "Pravat Bhusal");

        // store an integer called "age" with value 19
        editor.putInt("age", 19);

        // commit changes
        editor.commit();

        // retrieve the String key "name" use a default value of null if it does not exist
        String name = pref.getString("name", null);
        Log.d("name1", name);

        // remove the "name" key, then commit changes
        editor.remove("name");
        editor.commit();

        // now try and check if the String key "name" exists, so this should return false
        boolean nameExists = pref.contains("name");
        Log.d("name_exists", "" + nameExists);

        // clear all data, then commit changes
        editor.clear();
        editor.commit();
    }
}
