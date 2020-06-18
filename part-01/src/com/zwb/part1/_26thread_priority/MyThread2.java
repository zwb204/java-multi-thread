package com.zwb.part1._26thread_priority;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 17:36
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
