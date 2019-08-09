# Lecture 3 - Android Lifecycle, Explicit Intents
### 1. Android Lifecycle
The Android lifecycle refers to the lifecycle methods for each Activity in your Android project. Within
the lifecycle callback methods, you can declare how your activity behaves when the user leaves and
re-enters the activity.

##### 7 Lifecycle Methods
The app calls these methods whenever an activity experiences the below interactions.  
1. onCreate - called when activity is first created  
2. onStart - called when activity becomes visible to the user  
3. onResume - called when activity starts interacting with the user  
4. onPause - called when activity is not visible to the user  
5. onStop - called when activity is no longer visible to the user  
6. onRestart - called after your activity is stopped, prior to start  
7. onDestroy - called before the activity is destroyed

In the ```LifeCycleExampleActivity.java``` file, you can see the life cycle methods being used.

### 2. Explicit Intents
An intent is an action within the Android OS that you want to happen.

An explicit intent is an action to happen within the Android application. For example, opening a
new Activity within the Android application.

In this lecture, we're going to open the LifeCycleExampleActivity from within the MainActivity.

##### 1. Creating The LifeCycleExampleActivity
This step has already been done for you in this GitHub repository, but if you want to learn how
to create a new Activity in your Android project follow the instruction below.

1. In Android Studio under the "Android" project table, go to ```app/java/com.mad.lecture3```, then right
click on that folder.  
2. Click New -> Activity -> Empty Activity and create the LifeCycleExampleActivity, also make sure that
the "Generate Layout File" checkbox is checked when creating the Activity.

The ```LifeCycleExampleActivity.java``` and ```activity_life_cycle_example.xml``` files are now created!

##### 2. openLifeCycleExampleActivity Method
This method has already been programmed for you inside the ```MainActivity.java``` file. I will not
explain how this method is coded because it'll just be redundant of the concepts already taught in
Lectures 1 and 2.

Whenever the user clicks the "lifeCycleBTN" in the MainActivity, it calls this method.
 
This method creates an Intent to load the LifeCycleExampleActivity and passes data parameters of "from"
with a String value of "MainActivity" and "lecture" with an integer value of 3.

If you look at the ```onCreate``` method of ```LifeCycleExampleActivity.java```, you can see how the
program logs the data parameters passed from the ```MainActivity.java```.