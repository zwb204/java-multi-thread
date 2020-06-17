package com.zwb.part1._10isAlive;

/**
 * @Desc: isAlive()的作用是测试线程是否处于活动状态
 *        活动状态：指线程已经启动且尚未终止。线程处于正在运行或准备开始运行的状态，就认为线程是“存活”的。
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:18
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin==" + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end==" + myThread.isAlive());
    }
}
