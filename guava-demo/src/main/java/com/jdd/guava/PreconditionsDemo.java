package com.jdd.guava;

import com.google.common.base.Preconditions;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/23 10:33
 */
public class PreconditionsDemo {

    public double sqrt(double input) throws IllegalArgumentException {
        Preconditions.checkArgument(input > 0.0, "Illegal Argument passed: Negative value %s.", input);
        return Math.sqrt(input);
    }

    public int sum(Integer a, Integer b) {
        a = Preconditions.checkNotNull(a, "Illegal argument passed: First parameter is Null.");
        b = Preconditions.checkNotNull(b, "Illegal Argument passed: Second parameter is Null.");
        return a + b;
    }

    public int getValue(int input) {
        int[] data = {1, 2, 3, 4, 5};
        Preconditions.checkElementIndex(input, data.length, "Illegal Argument passed: Invalid index.");
        return 0;
    }

    public static void main(String[] args) {
        PreconditionsDemo preconditionsDemo = new PreconditionsDemo();

        try {
            System.out.println(preconditionsDemo.sqrt(-3.0));
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            System.out.println(preconditionsDemo.sum(null, 3));
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            System.out.println(preconditionsDemo.getValue(6));
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
