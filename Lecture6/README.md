# Lecture 6 - Volley, RecyclerView
### 1. Volley
Volley is an HTTP library that makes networking for Android apps faster and easier.

Install and Sync the Volley dependency using:  
```implementation 'com.android.volley:volley:1.1.1'```  
in your ```build.gradle Module: app``` file.

Since Volley sends HTTP Requests, it requires Internet permission to use.
1. Go to the ```manifests/AndroidManifest.xml``` file.
2. Add this line of code within the ```manifest``` element:  
```<uses-permission android:name="android.permission.INTERNET" />```

Inside the ```MainActivity.java``` file there's an example Volley HTTP Request that's carried out to receive
the data from the URL variable using the HTTP GET method. Once the client receives a response, the ```onResponse```
method is called and the code inside is executed. That method calls the ```populateItems``` method, which
is passed the response data as a JSONObject parameter.

Here's what the JSONObject contains:
```json
{
    "item1": "This is item 1,",
    "item2": "This is item 2.",
    "item3": "This is item 3."
}
```

### 2. RecyclerView
RecyclerView is a scrollable List UI.

Install and Sync the RecyclerView dependency using:  
```implementation 'androidx.recyclerview:recyclerview:1.0.0'```  
in your ```build.gradle Module: app``` file.

The method is already finished, so I'm going to explain the ```populateItems``` method that populates
the RecyclerView using the JSON data from the Volley section.
- We first parse the JSONObject parameter and receive the String value of each key
- Each String value is added into an ArrayList of Strings called ```namesList```
- Then we create a new RecyclerAdapter that takes in the ArrayList of Strings to construct the RecyclerView
- Lastly, the RecyclerView to have a LinearLayout

But how does the RecyclerAdapter work? It's too much of an explanation, so the code is provided within the
```RecyclerAdapter.java``` file with comments explaining how the adapter adds each item into the RecyclerView.