package com.zwb.part1._27thread_prioirty2;

/**
 * @Desc:
 * 优先级具有规则性，
 * 高优先级的线程总是大部分执行完，但不一定高优先级线程会全部先执行完
 * @Author: zwb
 * @CreateTime: 2020/6/17 18:22
 **/
public class Run {

    public static void main(String[] args) {
        for (int i = 0;i<100;i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
