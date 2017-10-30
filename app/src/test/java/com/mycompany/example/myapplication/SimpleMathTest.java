package com.mycompany.example.myapplication;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SimpleMathTest {

    //
    @Rule
    public ReportTextExecution rtx = new ReportTextExecution();
    SimpleMath sm;
    private List<String> list;

    @Before
    public void setUp() throws Exception {
        sm = new SimpleMath();
        list = createList();
    }

    @Test
    public void testAdd() {
        int total = sm.add(4, 5);
        assertEquals("Simple Math is not adding correctly", 9, total);
    }

    @Ignore
    @Test
    public void testDiff() {
        sm = new SimpleMath();
        int total = sm.diff(9, 2);
        assertEquals("Simple Math is not subtracting correctly", 7, total);
    }


    // With hamcrest
    @Test
    public void testListSizeComparingWithHamcrest() {
        assertThat(list, allOf(hasSize(greaterThanOrEqualTo(3)), hasSize(lessThan(12))));
    }

    public void testTypeSafetyWithHamcrest() {
//        assertThat("23",equalTo(2));
    }

    @Test
    public void testCheckContainItemInTheListWithHamcrest() {
        assertThat("Not contain items", list, hasItems("Arnob", "Work"));
    }

    // with jUnit

    public void testListSizeComparingWithAsserts() {
        assertTrue(list.size() >= 3);
        assertTrue(list.size() < 12);
    }

    @Test
    public void testCheckContainItemInTheListWithAsserts() {
        assertTrue(list.contains("Arnob"));
        assertTrue(list.contains("Work"));


    }


    private List<String> createList() {
        String list[] = {"Arnob", "Boy", "Work"};
        return Arrays.asList(list);
    }
}



