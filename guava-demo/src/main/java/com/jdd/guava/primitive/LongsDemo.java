package com.jdd.guava.primitive;

import com.google.common.primitives.Longs;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 17:05
 * @Modified By:
 */
public class LongsDemo {
    public static void main(String[] args) {
        /**
         * Longs.BYTES
         * Longs.MAX_POWER_OF_TWO
         *
         */

        long[] longArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //convert array of primitives to array of objects
        List<Long> objectArray = Longs.asList(longArray);
        System.out.println(objectArray.toString());

        //convert array of objects to array of primitives
        longArray = Longs.toArray(objectArray);
        System.out.print("[ ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println("]");

        //check if element is present in the list of primitives or not
        System.out.println("5 is in list? " + Longs.contains(longArray, 5));

        //Returns the minimum
        System.out.println("Min: " + Longs.min(longArray));

        //Returns the maximum
        System.out.println("Max: " + Longs.max(longArray));

        //get the byte array from an integer
        /**
         *
         * Returns a big-endian representation of {@code value} in an 8-element byte array; equivalent to
         * {@code ByteBuffer.allocate(8).putLong(value).array()}. For example, the input value {@code
         * 0x1213141516171819L} would yield the byte array {@code {0x12, 0x13, 0x14, 0x15, 0x16, 0x17,
         * 0x18, 0x19}}.
         *
         */
        byte[] byteArray = Longs.toByteArray(20000);
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + " ");
        }
        System.out.println();

    }
}
