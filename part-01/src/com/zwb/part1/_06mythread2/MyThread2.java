package com.zwb.part1._06mythread2;

/**
 * @Desc: 线程间共享变量
 * @Author: zwb
 * @CreateTime: 2020/6/16 22:27
 **/
public class MyThread2 extends Thread{

    private int count = 5;

    @Override
    public void run() {
        super.run();
        count --;
        System.out.println(this.currentThread().getName() + "计算，count=" + count);
    }
}
