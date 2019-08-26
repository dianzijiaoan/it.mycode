package com.jdd.guava.primitive;

import com.google.common.primitives.Chars;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 17:38
 * @Modified By:
 */
public class CharsDemo {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        //convert array of primitives to array of objects
        List<Character> objectArray = Chars.asList(charArray);
        System.out.println(objectArray.toString());

        //convert array of objects to array of primitives
        charArray = Chars.toArray(objectArray);
        System.out.print("[ ");
        for(int i=0; i<charArray.length; i++){
            System.out.print(charArray[i] + " ");
        }
        System.out.println("]");

        //check if element is present in the list of primitives or not
        System.out.println("c is in list? " + Chars.contains(charArray, 'c'));

        //return the index of element
        System.out.println("c position in list "+ Chars.indexOf(charArray, 'c'));

        //Returns the minimum
        System.out.println("Min: "+ Chars.min(charArray));

        //Returns the maximum
        System.out.println("Max: "+Chars.max(charArray));

        //get the byte array from an char
        byte[] byteArray = Chars.toByteArray('a');
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + " ");
        }

        System.out.println();
    }
}
