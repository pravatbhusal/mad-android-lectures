package com.mad.lecture5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // show a "Loaded the Android app!" Snackbar message
        View contentView = findViewById(android.R.id.content);
        Snackbar.make(contentView, "Loaded the Android app!", Snackbar.LENGTH_LONG).show();

        // load the image from the URL onto the picassoImage ImageView
        ImageView picassoImage = (ImageView) findViewById(R.id.picassoImage);
        String url = "https://raw.githubusercontent.com/Shadowsych/mad-android-lectures/master/Lecture5/lecture_materials/mad_icon.png";
        Picasso.get().load(url).into(picassoImage);
    }
}
