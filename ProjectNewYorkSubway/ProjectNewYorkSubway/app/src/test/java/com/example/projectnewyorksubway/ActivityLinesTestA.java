package com.example.projectnewyorksubway;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActivityLinesTestA {

    private int b = 0;

    @Test
    public void numberOfPeople() {

        ActivityLines a = new ActivityLines();
        int numPpl = a.numberOfPeople(b);

        assertEquals(b+1 ,numPpl);
    }
}