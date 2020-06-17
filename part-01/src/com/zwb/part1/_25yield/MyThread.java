package com.zwb.part1._25yield;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 16:49
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime));
    }
}
