package com.mad.lecture4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // constants used to uniquely identify the result being returned to onActivityRsult
    private int CAMERA_PIC_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // open the camera app
    public void openCamera(View view) {
        // start the activity, and listen for a result in the onActivityResult method
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_PIC_REQUEST);

        // log the activity_main.xml's HelloWorldFragment text into LogCat
        HelloWorldFragment helloWorldFragment = (HelloWorldFragment)
                getSupportFragmentManager().findFragmentById(R.id.helloWorldFragment);
        Log.d("hello_world_text", helloWorldFragment.getHelloWorldText());
    }

    // open the email app
    public void openEmail(View view) {
        // content for the email when opening the email app
        String[] addresses = {"pravat.bhusal@gmail.com", "pravat@utexas.edu"};
        String subject = "An email for testing purposes.";
        String text = "Hello! This is the text for a test email.";

        // set-up the intent, then start the activity if it exists
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // open the phone app
    public void openPhone(View view) {
        // phone number to show when opening the phone app
        String phoneNumber = "0123456789";

        // set-up the intent, then start the activity if it exists
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // open the browser app
    public void openBrowser(View view) {
        // URL for to show when opening the browser app
        String url = "google.com";

        // set-up the intent, then start the activity if it exists
        Uri website = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, website);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // an event listener that is called when an activity performs an event
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == CAMERA_PIC_REQUEST) {
            if(resultCode == RESULT_OK) {
                // receive the photo that was taken as a Bitmap
                Log.d("camera_photo", "Took a picture using the camera!");
                Bitmap imageData = (Bitmap) data.getExtras().get("data");
            }
        }
    }
}
