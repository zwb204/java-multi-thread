package com.zwb.part2._29synString2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 12:59
 **/
public class Service {
    public static void print(Object object) {
        try {
            synchronized (object) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
