package com.zwb.part1._28thread_prioirty3;

import java.util.Random;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 8:22
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0;i < 1000;i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("----------thread 2 use time=" + (endTime - beginTime));
    }
}
