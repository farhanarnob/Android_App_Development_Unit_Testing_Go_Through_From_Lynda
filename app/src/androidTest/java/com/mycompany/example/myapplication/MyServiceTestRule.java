package com.mycompany.example.myapplication;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.test.rule.ServiceTestRule;
import android.util.Log;

import java.util.concurrent.TimeoutException;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class MyServiceTestRule extends ServiceTestRule {

    private static final String TAG = MyServiceTestRule.class.getSimpleName();

    @Override
    public void startService(@NonNull Intent intent) throws TimeoutException {
        Log.e(TAG, "Work before service starts");
        super.startService(intent);
    }

    @Override
    public IBinder bindService(@NonNull Intent intent) throws TimeoutException {
        Log.e(TAG, "service has been bound");
        return super.bindService(intent);
    }
}
