package com.example.projectnewyorksubway;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.intent.rule.IntentsTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class MainActivityTest {


    @Rule

    public ActivityTestRule<MainActivity> myActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity myMainActivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(ActivityELine.class.getName(), null, false);

    @Before
    public void setUp() throws Exception {
        //first activity (the main activity)
        myMainActivity = myActivityTestRule.getActivity();
    }

    @Test
    public void openActivityLineTest() {

        assertNotNull(myMainActivity.findViewById(R.id.eline));

        onView(withId(R.id.eline)).perform(click());

        Activity activityE = getInstrumentation().waitForMonitorWithTimeout(monitor, 5000);

        assertNotNull(activityE);

        activityE.finish();
    }

    @After
    public void tearDown() throws Exception {
        myMainActivity = null;
    }
}