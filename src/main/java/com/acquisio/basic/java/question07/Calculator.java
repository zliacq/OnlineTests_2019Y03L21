package com.acquisio.basic.java.question07;

/**
 * QUESTION 08: Unit Test
 * Add Unit Test method(s) to test this method.
 * Add your tests to the CalculatorTest class to see the result of
 * your test.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Calculator {

    /**
     * This is a simple calculator for add/subtract/multiple/divide
     * @param x first value
     * @param y second value
     * @param operator operation
     * @return result of calculation
     */
    public static Integer applyOperation(int x, int y, char operator) {
        if (operator == '+') {
            return x + y;
        } else if (operator == '-') {
            return x - y;
        } else if (operator == '*') {
            return x * y;
        } else if (operator == '/') {
            if (y != 0) {
                return x / y;
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException(
                    String.format("Operator '%s' not supported", operator));
        }
    }

}
