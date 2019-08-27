package com.jdd.guava.math;

import com.google.common.math.LongMath;

import java.math.RoundingMode;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/27 14:38
 * @Modified By:
 */
public class LongMathDemo {
    public static void main(String[] args) {
        System.out.println(LongMath.isPowerOfTwo(16));
        System.out.println(LongMath.isPowerOfTwo(15));
        System.out.println(LongMath.checkedAdd(1700, 2500));
        System.out.println("-------------------");
        try {
            System.out.println(LongMath.checkedAdd(Long.MAX_VALUE, Long.MAX_VALUE));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(LongMath.divide(100, 5, RoundingMode.UNNECESSARY));

        try {
            //exception will be thrown as 100 is not completely divisible by 3 thus rounding is required, and
            // RoundingMode is set as UNNESSARY
            System.out.println(LongMath.divide(100, 3, RoundingMode.UNNECESSARY));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Log2(2): " + LongMath.log2(2, RoundingMode.HALF_EVEN));

        System.out.println("Log10(10): " + LongMath.log10(10, RoundingMode.HALF_EVEN));

        System.out.println("sqrt(100): " + LongMath.sqrt(LongMath.pow(10, 2), RoundingMode.HALF_EVEN));

        //最大公约数
        System.out.println("gcd(100, 50): " + LongMath.gcd(100, 50));

        System.out.println("modulus(100, 50): " + LongMath.mod(100, 50));

        //factorial 有上限， n取值21
        System.out.println("factorial(5): " + LongMath.factorial(5));

    }
}
















