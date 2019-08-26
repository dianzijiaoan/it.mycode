package com.jdd.guava.primitive;

import com.google.common.primitives.Doubles;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 17:27
 * @Modified By:
 */
public class DoublesDemo {
    public static void main(String[] args) {
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};

        //convert array of primitives to array of objects
        List<Double> objectArray = Doubles.asList(doubleArray);
        System.out.println(objectArray.toString());

        //convert array of objects to array of primitives
        doubleArray = Doubles.toArray(objectArray);
        System.out.print("[ ");
        for(int i=0; i<doubleArray.length; i++){
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println("]");

        //check if element is present in the list of primitives or not
        System.out.println("5.0 is in list? "+ Doubles.contains(doubleArray, 5.0));
        System.out.println("5.0f is in list? "+ Doubles.contains(doubleArray, 5.0f));

        //return the index of a element
        System.out.println("5.0 position in list "+ Doubles.indexOf(doubleArray, 5.0f));

        //Returns the minimum
        System.out.println("Min: "+Doubles.min(doubleArray));

        //Returns the maximum
        System.out.println("Max: "+Doubles.max(doubleArray));
    }
}
