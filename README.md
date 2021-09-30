# android-java-two-activity

# 👉 Step 1:
Create a new app with empty activity.

# 👉 Step 2:
Creating a new empty activity, name is: `activity_second`

![pic](assets/new_activity.png)

# 👉 Step 3:
Add some values into re/values/strings.xml:
```XML
<string name="tv_activity1_text">This is the 1st Activity</string>
<string name="tv_activity2_text">This is the 2nd Activity</string>
<string name="btn_activity1_text">Open the 2nd activity</string>
<string name="btn_activity2_text">Go back to the 1st Activity</string>
<string name="toast_activity1_text">Button is pressed on activity 1</string>
<string name="toast_activity2_text">Button is pressed on activity 2</string>
```

# 👉 Step 4:
Add a button and modify the TextView in activity_main.xml
```XML
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/tv_activity1_text"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button_activity2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/btn_activity1_text"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        tools:text="@string/btn_activity1_text" />
```