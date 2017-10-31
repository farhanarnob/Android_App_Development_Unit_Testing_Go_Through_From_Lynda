package com.mycompany.example.myapplication;

import android.content.Intent;
import android.os.IBinder;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ServiceTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */
@RunWith(AndroidJUnit4.class)
public class MyDemoServiceTest {
    @Rule
    public ServiceTestRule myServiceTestRule = new ServiceTestRule();

    @Test
    public void testService() throws TimeoutException {
        myServiceTestRule.startService(new Intent(InstrumentationRegistry.getTargetContext(),
                MyDemoService.class));
    }

    @Test
    public void testBoundService() throws Exception {
        IBinder binder = myServiceTestRule.bindService(new Intent(
                InstrumentationRegistry.getTargetContext(), MyDemoService.class
        ));
        MyDemoService service = ((MyDemoService.LocalBinder) binder).getService();
        assertNotNull("Bound service  is null", service);
    }
}