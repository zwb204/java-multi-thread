package com.zwb.part2._32deadLockTest;

import com.zwb.part2._30twoStop.ThreadB;

/**
 * @Desc:
 * 死锁
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 15:52
 **/
public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}