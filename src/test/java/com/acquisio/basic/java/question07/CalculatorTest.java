package com.acquisio.basic.java.question07;

import org.junit.Test;
import java.lang.IllegalArgumentException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CalculatorTest {

    // TODO: Insert your code here.
    @Test
    public void fiveAddThreeIsEight() throws Exception {
        assertEquals(8, Calculator.applyOperation(5, 3, '+').intValue());
    }
    @Test
    public void oneAddZeroIsOne() throws Exception {
        assertEquals(1, Calculator.applyOperation(1, 0, '+').intValue());
    }
    @Test
    public void twoMinusTwoIsZero() throws Exception {
        assertEquals(0, Calculator.applyOperation(2, 2, '-').intValue());
    }
    @Test
    public void threeXThreeIsNine() throws Exception {
        assertEquals(9, Calculator.applyOperation(3, 3, '*').intValue());
    }
    @Test
    public void fiveXZeroIsZero() throws Exception {
        assertEquals(0, Calculator.applyOperation(5, 0, '*').intValue());
    }
    @Test
    public void tenDivideTwoIsFive() throws Exception {
        assertEquals(5, Calculator.applyOperation(10, 2, '/').intValue());
    }
    @Test
    public void tenDivideZeroIsNull() throws Exception {
        assertNull(null, Calculator.applyOperation(10, 0, '/'));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Calculator.applyOperation(10, 10, '#');
    }
}
