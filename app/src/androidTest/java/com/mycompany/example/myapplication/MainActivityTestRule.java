package com.mycompany.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 * Modify jUnit rule for advanced option
 */

public class MainActivityTestRule<A extends Activity> extends ActivityTestRule {
    private static final String TAG = MainActivityTestRule.class.getSimpleName();

    MainActivityTestRule(Class activityClass) {
        super(activityClass);
    }


    @Override
    protected Intent getActivityIntent() {
        Log.e(TAG, "prepare the activity's intent");
        return super.getActivityIntent();
    }
}
