package com.jdd.guava;

import com.google.common.base.Throwables;

import com.jdd.guava.exception.InvalidInputException;

import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/23 13:58
 */
public class ThrowablesDemo {

    public double sqrt(double input) throws InvalidInputException{
        if(input<0) throw new InvalidInputException();
        return Math.sqrt(input);
    }

    public double getValue(int[] list, int index) throws IndexOutOfBoundsException{
        return list[index];
    }

    public void showcaseThrowables() throws InvalidInputException{
        try{
            sqrt(-3.0);
        }catch (Throwable e){
            // check the type of exception and throw it
            Throwables.propagateIfInstanceOf(e, InvalidInputException.class);
            Throwables.propagate(e);
        }
    }

    public void showcaseThrowables1(){
        try{
            int[] data = {1,2,3};
            getValue(data, 4);
        }catch (Throwable e){
            Throwables.propagateIfInstanceOf(e, IndexOutOfBoundsException.class);
            Throwables.propagate(e);
        }
    }

    public void dummyIO() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args){
        ThrowablesDemo throwablesDemo = new ThrowablesDemo();
        try{
            throwablesDemo.showcaseThrowables();
        }catch (InvalidInputException e){
            //get the root cause
            System.out.println(Throwables.getRootCause(e));
        }catch (Exception e){
            //get the stack trace in string format
            System.out.println(Throwables.getStackTraceAsString(e));
        }

        try{
            throwablesDemo.showcaseThrowables1();
        }catch (Exception e){
            System.out.println(Throwables.getStackTraceAsString(e));
        }

    }
}
