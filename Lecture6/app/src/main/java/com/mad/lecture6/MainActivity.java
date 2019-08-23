package com.mad.lecture6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        // instantiate the RequestQueue
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://www.google.com";

        // request a JSON response from the provided URL
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, url, null,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    // set-up the RecyclerView using the response JSON data
                    populateItems(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("volley_error", error.toString());
                }
            }
        );

        // add the request to the RequestQueue
        queue.add(jsonRequest);
    }

    // populate items into the recycler view using the provided JSON data
    private void populateItems(JSONObject data) {
        ArrayList<String> namesList = new ArrayList<String>();

        // parse the JSONObject into an ArrayList of Strings
        JSONArray dataKeys = data.names();
        for(int keyIndex = 0; keyIndex < dataKeys.length(); keyIndex++) {
            try {
                // append the value of this key into the data list
                String key = dataKeys.getString(keyIndex);
                String value = data.getString(key);
                namesList.add(value);
            } catch(JSONException error) {
                Log.e("populate_items", "There was an error trying to parse the data!");
            }
        }

        // set the adapter for the recycler view, and make it follow a linear layout
        recyclerView.setAdapter(new RecyclerAdapter(namesList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
