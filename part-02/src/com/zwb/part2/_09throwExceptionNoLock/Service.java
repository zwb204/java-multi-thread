package com.zwb.part2._09throwExceptionNoLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 14:08
 **/
public class Service {
    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0,8).equals("0.123456")) {
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + " run  exceptionTime=" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time=" + System.currentTimeMillis());
        }
    }
}
