package com.zwb.part1._06mythread2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 22:34
 **/
public class MyThread3 extends Thread {

    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        count --;
        System.out.println(this.currentThread().getName() + "计算，count=" + count);
    }
}
