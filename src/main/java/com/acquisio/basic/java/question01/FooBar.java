package com.acquisio.basic.java.question01;

/**
 * QUESTION 01: FooBar
 * You have a program that loop from 1 to 50.
 * <p>
 * The program must follow those rules:
 * - Must print 'Foo' if the value can be divided by 3.
 * - Must print 'Bar' if the value can be divided by 5.
 * - Otherwise, print the current integer value in the loop.
 * <p>
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class FooBar {
    public static void main(String[] args) {
        FooBar main = new FooBar();
        for (int i = 1; i <= 50; i++) {
            System.out.println(main.fooBar(i));
        }
    }

    /**
     * calculate the divided value
     * then return the value as required
     * @param value input value of integer
     * @return output String of the required
     */
    String fooBar(int value) {
        // TODO: Insert your code here
        String results = "";
        if (value % 3 == 0) {
            results += "Foo";
        }

        if (value % 5 == 0) {
            results += "Bar";
        }

        return results.isEmpty() ? Integer.toString(value) : results;
    }
}
