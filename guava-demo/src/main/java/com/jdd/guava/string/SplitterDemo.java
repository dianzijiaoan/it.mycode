package com.jdd.guava.string;

import com.google.common.base.Splitter;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 14:38
 * @Modified By:
 */
public class SplitterDemo {
    public static void main(String[] args) {
        //连贯操作是 new Splitter() 新对象，并把当前的值传递过去，这样效能是否低？
        Iterable<String> iterables = Splitter.on(",")
                .trimResults()
                .omitEmptyStrings()
                .split("the, quick, , brown    , fox,    jumps, over, the, lazy, little dog.");

        System.out.println(iterables);

    }
}
