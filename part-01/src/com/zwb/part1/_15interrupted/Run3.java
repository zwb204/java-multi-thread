package com.zwb.part1._15interrupted;

/**
 * @Desc:
 * isInterrupted()
 * 测试线程Thread对象是否已经中断。不清除状态标志。
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:32
 **/
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1 ? = " + thread.isInterrupted());
            System.out.println("是否停止2 ? = " + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}


