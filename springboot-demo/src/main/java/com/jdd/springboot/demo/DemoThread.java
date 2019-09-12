package com.jdd.springboot.demo;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/9/4 16:33
 * @Modified By:
 */
public class DemoThread implements Runnable {
    private String title;

    public DemoThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getName() + " 执行 " + this.title);
    }

}
