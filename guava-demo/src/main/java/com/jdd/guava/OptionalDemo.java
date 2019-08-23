package com.jdd.guava;

import com.google.common.base.Optional;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/23 10:10
 */
public class OptionalDemo {

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("First parameter is present: "+a.isPresent());
        System.out.println("Second parameter is present："+b.isPresent());

        Integer value1 = a.or(new Integer(0));
//        Integer value2 = b.get();
        Integer value2 = b.or(new Integer(0));

        return value1 + value2;
    }

    public static void main(String[] args) {
        OptionalDemo optionalDemo = new OptionalDemo();

        Integer value1 = null;
//        Integer value2 = new Integer(10);
        Integer value2 = null;

        Optional<Integer> a = Optional.fromNullable(value1);
//        Optional<Integer> b = Optional.of(value2);
        Optional<Integer> b = Optional.fromNullable(value2);

        System.out.println(optionalDemo.sum(a,b));
    }

}
