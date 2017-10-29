package com.mycompany.example.myapplication;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMathTest {

    @Test
    public void testAdd() {
        SimpleMath sm = new SimpleMath();
        int total = sm.add(4, 5);
        assertEquals("Simple Math is not adding correctly", 9, total);
    }

    @Ignore
    @Test
    public void testDiff() {
        SimpleMath sm = new SimpleMath();
        int total = sm.diff(9, 2);
        assertEquals("Simple Math is not subtracting correctly", 7, total);
    }
}



