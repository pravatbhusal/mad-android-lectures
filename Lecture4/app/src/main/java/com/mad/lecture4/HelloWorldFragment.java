package com.mad.lecture4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HelloWorldFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hello_world, container, false);
    }

    // a default constructor for the fragment class
    public HelloWorldFragment() {
    }

    // return the helloWorldText's text value
    public String getHelloWorldText() {
        TextView helloWorldText = getView().findViewById(R.id.helloWorldText);
        return helloWorldText.getText().toString();
    }
}
