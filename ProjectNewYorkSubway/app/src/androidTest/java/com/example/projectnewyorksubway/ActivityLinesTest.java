package com.example.projectnewyorksubway;


/*import android.support.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;

import androidx.test.runner.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.core.app.ApplicationProvider;
//import androidx.test.ext.junit.runners.AndroidJUnit4;

import android.widget.Button;
import android.widget.ScrollView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;

//import androidx.test.rule.ActivityTestRule;

import static android.provider.Settings.System.getString;

//import static android.support.test.espresso.action.ViewActions.click;
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.scrollTo;
//import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
*/

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.runner.AndroidJUnitRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.core.app.ApplicationProvider;

import android.support.test.rule.ActivityTestRule;
import android.widget.ScrollView;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

//@RunWith(AndroidJUnit4.class)
//@RunWith(RobolectricTestRunner::class)

public class ActivityLinesTest {

    String factTest = "hello testing";
    ScrollView scrollViewTest;

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {

    }



    @Test
    public void scrollingToTop() {
        //click on button
        onView(withId(R.id.radioButtonD)).perform(scrollTo(), click()).check(matches(isDisplayed()));


    }


}