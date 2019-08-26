package com.jdd.guava.primitive;

import com.google.common.primitives.Shorts;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 16:24
 * @Modified By:
 */
public class ShortsDemo {
    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //convert array of primitives to array of objects
        List<Short> objectArray = Shorts.asList(shortArray);
        System.out.println(objectArray.toString());

        //convert array of objects to array of primitives
        shortArray = Shorts.toArray(objectArray);
        System.out.print("[ ");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println("]");

        short data = 5;
        //check if element is present in the list of primitives or not
        System.out.println("5 is in list? " + Shorts.contains(shortArray, data));

        //Returns the minimum
        System.out.println("Min: " + Shorts.min(shortArray));

        //Returns the maximum
        System.out.println("Max: " + Shorts.max(shortArray));

        data = 2400;
        //get the byte array from an integer
        /**
         * Shorts.toByteArray 非常有用(Returns a big-endian representation of {@code value} in a 2-element byte array)；与
         * Shorts.fromBytes 互转
         *
         * Shorts.BYTES 类型占用的字节数
         * Shorts.MAX_POWER_OF_TWO  //The largest power of two that can be represented as a {@code short}.
         *
         * Short.MAX_VALUE = 32767
         */

        byte[] byteArray = Shorts.toByteArray(data);
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + " ");
        }

        System.out.println();
    }
}
