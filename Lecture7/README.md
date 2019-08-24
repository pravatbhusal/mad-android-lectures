# Lecture 7 - Shared Preferences
SharedPreferences is an Android API to save key-value paired data into your Android device. This  data
will persist even when the user closes the application. The data will only be lost if the user uninstalls
the app or clears the applications data via the Settings app.

In the ```MainActivity.java``` file, there are some examples of using SharedPreferences to persist data.

### Modes
There are multiple modes to SharedPreferences.
- MODE_PRIVATE: the default mode, where the created file can only be accessed by the calling application
- MODE_WORLD_READABLE: Creating world-readable files is very dangerous, and likely to cause security holes in applications
- MODE_WORLD_WRITEABLE: Creating world-writable files is very dangerous, and likely to cause security holes in applications
- MODE_MULTI_PROCESS: This method will check for modification of preferences even if the Shared Preference instance has already been loaded
- MODE_APPEND: This will append the new preferences with the already existing preferences
- MODE_ENABLE_WRITE_AHEAD_LOGGING: Database open flag. When it is set, it would enable write ahead logging by default

Source: https://www.journaldev.com/9412/android-shared-preferences-example-tutorial

The most secure is MODE_PRIVATE, so we're going to use that mode for this lecture.

### Storing Data
There are multiple methods to store data using the Editor from the SharedPreferences.
- editor.putBoolean(key, value)
- editor.putString(key, value)
- editor.putInt(key, value)
- editor.putFloat(key, value)
- editor.putLong(key, value)

Then to save changes, use the editor.commit() method.

### Retrieving Data
There are multiple methods to retrieve data using the Editor from the SharedPreferences.
- pref.getString(key, default)
- pref.getInt(key, default)
- pref.getFloat(key, default)
- pref.getLong(key, default)
- pref.getBoolean(key, default)

### Removing Data
To remove data, use the editor.remove(key) method. To clear all data, use the editor.clear() method.

Then to save changes, use the editor.commit() method.