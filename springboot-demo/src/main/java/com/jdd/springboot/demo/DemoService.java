package com.jdd.springboot.demo;

import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/9/4 16:28
 * @Modified By:
 */
@Service
public class DemoService {

    public void sayHi(String name){
        System.out.println(name+" say hi!");
    }
}
