package com.mycompany.example.myapplication;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 * Testing another activity
 */

@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {
    @Rule
    public ActivityTestRule<SecondActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(SecondActivity.class);
    private Activity mActivity;

    @Before
    public void setUp() throws Exception {
        mActivity = mainActivityActivityTestRule.getActivity();
    }

    @Test
    public void testUI() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.text_view_second));
    }

}