package com.zwb.part2._28synString;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 12:59
 **/
public class Service {
    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
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
