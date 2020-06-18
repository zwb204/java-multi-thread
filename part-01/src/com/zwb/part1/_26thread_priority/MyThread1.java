package com.zwb.part1._26thread_priority;

import java.util.function.DoubleToIntFunction;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 17:34
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
