package com.jdd.springboot.demo;

import java.util.concurrent.*;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/9/4 16:26
 * @Modified By:
 */
public class Demo {

    public static void main2(String[] args) {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
        ThreadFactory factory = r -> new Thread(r, "test-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.SECONDS, queue, factory, new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + ":执行任务");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public static void main3(String[] args) {

//        ThreadFactory factory = r -> new Thread(r, "test-thread-pool-%d");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(10),
                //new ThreadFactoryBuilder().setNameFormat("transfer-goods-thread-pool-%d").build(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 1000; i++) {
            String[] strs = new String[]{"str0", "str1", "str2", "str3", "str4", "str5", "str6", "str7", "str8",
                    "str9"};
            Future<?> future = executor.submit(new DemoThread(strs[(int)(Math.random()*10)]));

        }

        System.out.println("end");

    }

    public static void main(String[] args) {
        try{
            Long a = Long.parseLong("");
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
