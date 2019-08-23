# Lecture 4 - Implicit Intents, Fragments
### 1. Implicit Intents
An intent is an action within the Android OS that you want to happen.

An implicit intent is an action to happen outside the Android application. For example, opening a
Calculator application by clicking a button within the Android application. To get all the common intents,
check out the intents documentation [here] (https://developer.android.com/guide/components/intents-common).

Inside the ```MainActivity.java``` file, there are a few example of using implicit intents to open
the Camera, Email, Phone, and Web Browsing applications on the Android phone.

Also, for convenience sack, instead of having to manually program each onClickListener in the Java code,
the buttons in the ```activity_main.xml``` each have its "onClick" attribute set to its respective
methods in the ```MainActivity.java``` file. This is a much simpler approach, and I plan on using this
onClick approach for the rest of the lectures.

### 2. Fragments
A fragment is a piece of an Activity, like a sub-activity, that enables modular design. It has its
own life cycle and behaviors, and you can combine multiple fragments within a parent Activity to
build a multi-pane UI.

The ```HelloWorldFragment.java``` file is an example of the Java code for a fragment. Unlike a typical
Activity, a Fragment will extend the "Fragment" class to denote that it's a fragment. The
```fragment_hello_world.xml``` file is the XML layout for the ```HelloWorldFragment.java``` class.

Inside the ```activity_main.xml``` file, we dragged and dropped a "fragment" component into the screen.
This fragment component is linked to the ```HelloWorldFragment.java``` Java code, and the layout attribute
is set to the ```fragment_hello_world.xml``` layout file.

Inside the ```ActivityMain.xml``` file within the ```onCreate``` method, we access the fragment by
using the code below:
```java
HelloWorldFragment helloWorldFragment = (HelloWorldFragment)
                getSupportFragmentManager().findFragmentById(R.id.helloWorldFragment);
```

This variable is a reference to the HelloWorldFragment fragment object inside the ```activity_main.xml``` file.
Because now we have a reference to the fragment object, the ```getHelloWorldText``` method from the
HelloWorldFragment class was called and its return value was logged by the ActivityMain class like so:
```java
Log.d("hello_world_text", helloWorldFragment.getHelloWorldText());
```
