package com.jdd.guava.string;

import com.google.common.base.Joiner;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 14:27
 * @Modified By:
 */
public class JoinerDemo {
    public static void main(String[] args) {
        //连贯操作是 new Splitter() 新对象，并把当前的值传递过去，这样效能是否低？
        String str = Joiner.on("、")
//                .skipNulls()
                .useForNull("null")
                .join(Arrays.asList(1,2,3,4,5,null,6));
        System.out.println(str);
    }
}
