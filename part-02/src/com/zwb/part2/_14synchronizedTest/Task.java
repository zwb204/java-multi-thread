package com.zwb.part2._14synchronizedTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 11:27
 **/
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName="
                    + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0;i<100;i++) {
                System.out.println("synchronized threadName="
                                + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }
}
