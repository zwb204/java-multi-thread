package com.zwb.part1._12sleep;

/**
 * @Desc:
 * sleep()的作用是在指定的毫秒数内让当前“正在执行的线程”休眠（暂停执行）。
 * 这个“正在执行的线程”是指this.currentThread()返回的线程。
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:41
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("end threadName=" + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
