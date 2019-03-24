package com.acquisio.basic.java.question03;

/**
 * QUESTION 04: StackOverflow
 * This program crashes after throwing StackOverflowError exception:
 * Fix the factorial method.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class IssueResolving {
    public static void main(String[] args) {
        IssueResolving instance = new IssueResolving();
        System.out.println(instance.factorial(7));
    }

    /**
     * This method calculate the factorial of given integer
     * @param n the integer to calculate
     * @return factorial value
     */
    int factorial(int n) {
        // TODO: Fix code here.
        if(n == 0){
            return 1;
        };
        return factorial(n - 1) * n;
    }

}
