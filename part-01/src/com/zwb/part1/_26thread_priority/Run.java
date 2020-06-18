package com.zwb.part1._26thread_priority;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 17:37
 **/
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end   priority=" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
