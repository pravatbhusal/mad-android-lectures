# Lecture 2 - Resources, Java + XML
### 1. Resources
The res (resources) folder contains your app's assets such as images, designs, backgrounds, etc.  
In this lecture, we're going to understand this folder and how to manage your app's resources.

The below steps are examples to using each resource folder. If you downloaded this repository, then
all of these steps are already done for you, so it's just there for reference.

##### 1. ```drawable``` folder
The drawable folder contains your app's images, backgrounds, vector art. We can actually add new
assets into the drawable folder, and access them in our XML layout files.

We're going to do that with an example image using an example ```longhorn.png``` file.

1. Open Android Studio, and view the "Android" project view.  
2. Place the ```longhorn.png``` file inside of the ```res/folder``` directory.  

We've successfully imported a new drawable into our project, so now we can use it in our layouts!

##### 2. ```layout``` folder
The layout folder contains your XML layouts for your Android app. Previously, we just imported a
new image into our project, so let's use this image in our ```main_activity.xml``` layout.

1. Open the ```res/layout/activity_main.xml``` file in Android Studio, then open the design tab.  
2. Drag and drop an ImageView onto the layout.  
3. When choosing an image in the ImageView pop-up, choose the ```longhorn.png``` file, then press OK.  

The image is now on your layout! Make sure to add constraints to the image to prevent layout errors.

##### 3. ```mipmap``` folder
The mipmap folder contains your app's icon that are shown whenever its downloaded on a phone.

Inside the ```res/mipmap``` directory there are two folders: ```ic_launcher``` and ```ic_launcher_round```.
- ic_launcher stands for icon launcher
- ic_launcher_round stands for round icon launcher

These two folders contain the varying icons that show on varying types of Android phones.

In order to change the icon of your app, just replace each image within the folder to your icon.

You can also just add a new Image Asset by right-clicking the ```res/mipmap``` directory and clicking New ->
Image Asset -> Then just add the icon image you want into the mipmap directory.

##### 4. ```values``` folder
The values folder contains your app's content: text, colors, and styles.

In an empty Android project, the ```values``` folder contains 3 files:
- ```strings.xml```: Variables for String texts
- ```colors.xml```: Variables for the color scheme
- ```styles.xml```: A stylesheet for your app's theme

Let's add some new variables into ```strings.xml``` and use it in our layout!  
1. Add a new line inside the ```<resources>``` tag: ```<string name="hello_world">Hello World</string>```  
2. Add another new line inside the ```<resources>``` tag: ```<string name="goodbye_world">Goodbye World</string>```  
2. In the ```activity_main.xml``` file, drag and drop a TextView.  
3. Change the TextView's id to ```msgText```, then change the TextView's ``text`` attribute to ```@string/hello_world```  

Notice how the text changed to "Hello World!" on the TextView. This is because it's using the ```hello_world```
variable from the ```strings.xml``` file.

Now that we just learned how to use the ```strings.xml``` file, let's configure the ```colors.xml```  
1. Configure the colors inside the ```<color>``` tag to whatever color scheme you wish.  

That's about it. If you want to add new colors and use them in your layout, you can do it like we did
in the ```strings.xml``` but instead use a new ```<color>``` tag.

Since we just messed around with the ```colors.xml```, let's do the same for ```styles.xml```.
Let's configure the theme of our Android app by changing the Base application theme.  
1. Change ```parent="Theme.AppCompat.Light.DarkActionBar""``` to ```parent=Theme.AppCompat.Light.NoActionBar```
- This uses a light (white background) App theme without a navigation bar on the top of the app

You can discover many new types of themes by previewing them within the design tab of Android Studio.

### 2. Java + XML
Now that we've understand the resources folder, we can start linking our XML layouts with Java.  

Remember, XML is the layout code of your app while Java is the functionality code. In order for the
app to work properly, we link Java and XML together.

We're going to do that using a Button in the XML layout and calling a Java function whenever it's clicked!

If you downloaded this repository, then all of the steps below are already done for you, so it's just there for reference.

1. In the ```activity_main.xml``` file, drag and drop a Button.  
2. Change the Button's id to ```clickMeBTN```. Then change its text attribute to "Click Me".  
- It's advised to change the text attribute using a String variable from ```strings.xml```!
3. Now open the ```java/com.mad.lecture2/MainActivity.java``` file.
4. Add a class (global) variable ```private Button clickMeBTN;```, do not initialize it.
- This variable will become a reference to the ```clickMeBTN``` within the layout XML file 
5. Add another class variable ```private TextView msgText```, do not initialize it.
- This variable will become a reference to the ```msgText``` within the layout XML file
5. In the ```onCreate``` method, add ```clickMeBTN = findViewById(R.id.clickMeBTN);```
- This line of code links the ```clickMeBTN``` variable in Java to the Button in XML
6. In the ```onCreate``` method, also add ```msgText = findViewById(R.id.msgText);```
- This line of code links the ```msgText``` variable in Java to the TextView in XML

So now the XML layout's ```clickMeBTN``` is linked to the Java variable ```clickMeBTN```, and the XML
layout's ```msgText``` is linked to the Java variable ```msgText```. Now we can program an onClick
listener (a function that execute whenever clicking the button) to our Java code.

6. Add this piece of code outside of the ```onCreate``` method but inside the Java class:  
```java
// change the message text to "Goodbye World"
private void sayGoodbye() {
    msgText.setText(R.string.goodbye_world);
}
```
This piece of code is a function to change the msgText TextView to "Goodbye World".

7. Now inside the ```onCreate``` method, add this code:  
```java
// listen for clicks on the clickMeBTN
clickMeBTN.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sayGoodbye();
    }
});
```
This piece of code is an onClick listener to listen to clicking events on the ```clickMeBTN```. Once
a clicking event is heard, it will call the ```onClick``` method within the listener. Inside the
```onClick``` method, it will call the ```sayGoodbye``` function.

So basically, whenever the user clicks the "Click Me" button, it changes the msgText to "Goodbye World".

Since you've learned to link elements XML layouts to Java code, try programming other things now!  
A cool exercise could be changing the color of a TextView whenever clicking a Button.

### 3. Documentation
You may be wondering where you can learn about the XML attributes and Java methods to layout elements.
Fortunately, all that information can be provided by the [Android Documentation](https://developer.android.com/reference).

For example, [here](https://developer.android.com/reference/android/widget/TextView) is the documentation for TextView.
- If you look through the TextView documentation, you can find the ```setText``` Java method we used!

