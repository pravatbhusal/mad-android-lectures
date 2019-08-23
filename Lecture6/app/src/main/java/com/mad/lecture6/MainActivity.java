package com.mad.lecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate the RequestQueue
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://www.google.com";

        // request a string response from the provided URL
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    // set-up the RecyclerView using the response data
                    initiateRecyclerView(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("volley_error", error.toString());
                }
            }
        );

        // add the request to the RequestQueue
        queue.add(stringRequest);
    }

    // initiate the recycler view using the provided data
    private void initiateRecyclerView(String data) {

    }
}
