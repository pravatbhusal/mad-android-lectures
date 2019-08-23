# Lecture 6 - Volley, RecyclerView
### 1. Volley
Volley is an HTTP library that makes networking for Android apps faster and easier. Install and Sync the Volley
dependency using: ```implementation 'com.android.volley:volley:1.1.1'``` in your ```build.gradle Module: app``` file.

Since Volley sends HTTP Requests, it requires Internet permission to use.
1. Go to the ```manifests/AndroidManifest.xml``` file.
2. Add this line of code within the ```manifest``` element:
```<uses-permission android:name="android.permission.INTERNET" />```

### 2. RecyclerView