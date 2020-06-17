package com.zwb.part1._16useExceptionInterrupt;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:54
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
