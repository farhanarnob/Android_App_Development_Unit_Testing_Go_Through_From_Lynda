package com.mycompany.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.widget.TextView;

import org.junit.Before;
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
    // custom rule
    @Rule
    public MainActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new MainActivityTestRule<>(MainActivity.class);
    private Activity mActivity;
    private TextView mHelloView;
    private Context context;

    @Before
    public void setUp() throws Exception {
        mActivity = mainActivityActivityTestRule.getActivity();
        mHelloView = mActivity.findViewById(R.id.test_view_hello_world);
        // get context use InstrumentationRegistry
        context = InstrumentationRegistry.getTargetContext();
    }


    // ui test ui automator
    @Test
    public void testPressBackButton() {
        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).pressBack();
    }

    // ui test with ui automator
    @Test
    public void testUiDevice() throws RemoteException {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if (device.isScreenOn()) {
            device.setOrientationLeft();
            device.openNotification();
        }
    }

    @Test
    public void testUiSelector() throws InterruptedException, UiObjectNotFoundException {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiSelector editTextSelector = new UiSelector()
                .className("android.widget.EditText")
                .focusable(true)
                .text("Hello World!");

        UiObject editTextWidget = device.findObject(editTextSelector);

        editTextWidget.setText("No Man");

        Thread.sleep(2000);

    }

    @Test
    public void testUI() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.test_view_hello_world));
        assertTrue(mHelloView.isShown());
        String text = mHelloView.getText().toString();
        assertEquals("Hello World!", text);
        assertNull(mActivity.findViewById(R.id.one_button).getTag());
    }

    @Test
    public void testCheckFromContextString() throws Exception {
        assertEquals(context.getString(R.string.hello_world), mHelloView.getText());
    }
}