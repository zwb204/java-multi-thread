package com.zwb.part1._16useExceptionInterrupt;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 11:06
 **/
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread3 thread = new MyThread3();
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
