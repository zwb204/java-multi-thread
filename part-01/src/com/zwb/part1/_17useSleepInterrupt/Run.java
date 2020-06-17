package com.zwb.part1._17useSleepInterrupt;

/**
 * @Desc:
 * 在sleep状态下停止某一线程，会进入catch语句，并且清除停止状态值，使之变成false
 * @Author: zwb
 * @CreateTime: 2020/6/17 11:12
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
