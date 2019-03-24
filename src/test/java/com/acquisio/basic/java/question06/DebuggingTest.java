package com.acquisio.basic.java.question06;

import org.junit.Test;

import static org.junit.Assert.*;

public class DebuggingTest {
    @Test
    public void removeEvenNumbers() throws Exception {
        assertArrayEquals(new Integer[]{1, 3}, new Debugging().removeEvenNumbers(1, 2, 3, 4));
    }

    @Test
    public void removeEvenNumbers2() throws Exception {
        assertArrayEquals(new Integer[]{5, 7, 11, 17}, new Debugging().removeEvenNumbers(5, 7, 8, 11, 14, 16, 17));
    }
}