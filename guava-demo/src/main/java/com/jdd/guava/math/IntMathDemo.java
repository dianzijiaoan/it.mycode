package com.jdd.guava.math;

import com.google.common.math.IntMath;

import java.math.RoundingMode;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 18:03
 * @Modified By:
 */
public class IntMathDemo {
    public static void main(String[] args) {
        try{
            System.out.println(IntMath.checkedAdd(Integer.MAX_VALUE, Integer.MAX_VALUE));
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println(IntMath.divide(100, 5, RoundingMode.UNNECESSARY));
        try{

        }catch (ArithmeticException e){

        }
    }
}
