# Lecture 1 - Android Studio Basics
### Setting-up Android Studio
We're going to keep up-to-date with the latest features brought by Android Studio. The steps below will show you how to do that.

1. Install Android Studio [here](https://developer.android.com/studio/install).  
    - Install the latest version of Android Studio
2. Install the latest SDK in Android Studio by going to Tools -> SDK Manager -> SDK Platforms -> Android SDK  
3. Install the latest Tools in Android Studio by going to Tools -> SDK Manager -> SDK Tools.  
4. Now restart Android Studio.

### Folder Structure
Assuming you're viewing the ```Android``` folder structure on Android Studio, the files and folders
below are essential to understanding how Android development works.

##### ```Gradle Scripts```:
The gradle scripts contain the configurations to develop your app.

1. ```build.gradle (Project)```: Configuration for all modules
    - A module is like a project from the Eclipse IDE
2. ```build.gradle (Module)```: Configuration for individual modules
    - Dependency management, API version, etc.

In MAD, we're only going to worry about the ```build.gradle (Module)``` file.

##### ```app``` folder:
The app folder contains the source code and assets used to create your app.

1. ```manifests``` folder.
    - ```AndroidManifest.xml```: App's permissions, orientation, configuration of app themes, etc.
        - Presents essential information about your app to the phone

2. ```java``` folder.
    - ```main``` source: Contains the primary Java source code that your app runs on
    - ```androidTest``` source: Unit tests to test your Android app's functionality
    - ```test``` source: Pure Unit tests that are not Android-specific

In MAD, we're only going to focus on the ```main``` source folder.

3. ```res``` (resource) folder.
    - ```drawable``` folder: Visual assets such as images, backgrounds, etc.
    - ```layout``` folder: Page and component designs
    - ```mipmap``` folder: Your app's icon that's shown when downloading it on the phone
    - ```values``` folder: Configuration files such as texts, styling, etc.
        - The ```values``` folder is very important for [locales](https://developer.android.com/training/basics/supporting-devices/languages)

### XML Layout
An Android app's layouts (UI) are coded in XML. XML is a markup language that is very similar to HTML.
In fact, if you've ever worked with HTML before, then XML would be very easy to grasp since the concepts are the same.

Fortunately, we don't need to code any layouts because Android Studio provides a drag-and-drop XML layout tool!

##### activity_main.xml
Head on over to the ```res/layout``` folder to see all of your layout files. In a fresh new empty Android Studio project,
you should see a file called ```activity_main.xml```. This file is the first page that will show when your app loads.

Open the activity_main.xml file in Android Studio, and a design and text tab should appear.
- The design tab is the drag-and-drop tool that Android Studio provides to create the layout
- The text tab is the XML code for the layout

##### Constraint Layout
ConstraintLayout is a powerful, and typically the most effective, layout within Android Studio. The layout
constraints each element within the layout to other element.These constraints positions your elements to the
size of the phone, so the element's position would be flexible to the phone's screen size.

For example, an element that is constrained to the top, bottom, left, and right of the phone screen aligns to the middle
of the screen because the element's being "dragged" (constrained) by all four sides of the screen.

This lecture uses the Constraint Layout in the ```activity_main.xml``` file.

##### Relative Layout
RelativeLayout is a layout that positions the elements relative to other elements.

For example, an element can be positioned to the left of another element, or on top of an element, etc.

##### Linear Layout
A layout that can "stack" elements vertically or push elements horizontally.

### Logcat
Although the standard Java console works in Android Studio, Android programmers are advised to use Logcat.
- Logcat: A command-line tool that dumps a log of system messages for debugging
- To start Logcat, go to Run -> Debug

There are multiple methods to logging messages onto Logcat, some of them are:
- ```Log.d```: Debug messages
- ```Log.e```: Error messages
- ```Log.i```: Info messages
- ```Log.v```: Verbose messages
- ```Log.w```: Warning messages


```System.out.println```, like in standard Java, is used to print outputs onto the Java console.  
In contrast, ```Log.d``` is used to log debug messages onto the Logcat console.

You may use ```System.out.println``` for logging messages, but it's convention to just use ```Log```.

