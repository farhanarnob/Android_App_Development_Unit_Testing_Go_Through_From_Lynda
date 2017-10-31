package com.mycompany.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyDemoService extends Service {
    private static final String TAG = MyDemoService.class.getSimpleName();

    public MyDemoService() {
    }

    @Override
    public void onCreate() {
        Log.e(TAG, "creating MyDemoService");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(TAG, "Executing some work");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "Destroying my service");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new LocalBinder();
    }

    public class LocalBinder extends Binder {
        MyDemoService getService() {
            return MyDemoService.this;
        }
    }
}
