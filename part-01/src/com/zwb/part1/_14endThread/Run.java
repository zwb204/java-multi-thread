package com.zwb.part1._14endThread;

/**
 * @Desc:
 * interrupt()方法并不是马上就停止线程，而是在当前线程中打了一个停止的标记
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:13
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
    }
}
