package com.mycompany.example.myapplication;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 * instrument testing
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUI() throws Exception {
        Activity activity = mainActivityActivityTestRule.getActivity();
        assertNotNull(activity.findViewById(R.id.test_view_hello_world));
        TextView helloView = activity.findViewById(R.id.test_view_hello_world);
        assertTrue(helloView.isShown());
        String text = helloView.getText().toString();
        assertEquals("Hello World!", text);
        assertNull(activity.findViewById(R.id.one_button).getTag());
    }

}