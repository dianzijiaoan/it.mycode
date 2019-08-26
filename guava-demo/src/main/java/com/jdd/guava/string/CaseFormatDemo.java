package com.jdd.guava.string;

import com.google.common.base.CaseFormat;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 14:52
 * @Modified By:
 */
public class CaseFormatDemo {
    public static void main(String[] args) {
        /**
         * LOWER_CAMEL              Java变量的命名规则，如“lowerCamel”。
         * LOWER_HYPHEN             连字符连接变量的命名规则，如“lower-hyphen”。
         * LOWER_UNDERSCORE         C ++变量命名规则，如“lower_underscore”。
         * UPPER_CAMEL              Java和C++类的命名规则，如“UpperCamel”。
         * UPPER_UNDERSCORE         Java和C++常量的命名规则，如“UPPER_UNDERSCORE”。
         */

        String data = "test_data";

        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL,"test-data"));

        //两组结果相同
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "TEST_DATA"));
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));

//        CaseFormat[] cfs = CaseFormat.values();
//        for(CaseFormat cf : cfs) {
//            System.out.println(cf.toString());
//        }
//
//        System.out.println("=====================");
//        System.out.println(CaseFormat.valueOf(CaseFormat.LOWER_HYPHEN.name()));
    }
}
