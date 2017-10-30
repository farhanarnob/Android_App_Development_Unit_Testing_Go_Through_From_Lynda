package com.mycompany.example.myapplication;

import com.mycompany.example.myapplication.categories.FastTests;
import com.mycompany.example.myapplication.categories.GoogleMapsIntegrationTests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 * For learning Test Suite, category in test cases
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({SimpleMathTest.class})// which test classes should run
@Categories.ExcludeCategory({GoogleMapsIntegrationTests.class}) // which category should not test
@Categories.IncludeCategory({FastTests.class}) // which category should test
public class MyTestSuite {
}
