package com.zwb.part1._15interrupted;

/**
 * @Desc:
 * interrupted()，测试“当前”线程是否中断。
 * 在这里，当前线程是main，从未中断过，所以打印两个false
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:19
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println("是否停止1 ? = " + thread.interrupted());
            System.out.println("是否停止2 ? = " + thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
