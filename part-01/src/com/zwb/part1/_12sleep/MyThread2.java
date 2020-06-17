package com.zwb.part1._12sleep;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:47
 **/
public class MyThread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin =" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("end threadName=" + this.currentThread().getName() + " end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
