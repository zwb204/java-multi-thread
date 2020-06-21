package com.zwb.part2._16synchronizedThis;

import com.zwb.part2._15doubleSynBlockOneTwo.ThreadA;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 15:17
 **/
public class Task {
    public synchronized void otherMethod() {
        System.out.println("-------------------------------run--otherMethod");
    }
    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0;i < 10000;i++) {
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
