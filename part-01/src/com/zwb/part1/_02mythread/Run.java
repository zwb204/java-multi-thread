package com.zwb.part1._02mythread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 13:43
 **/
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
