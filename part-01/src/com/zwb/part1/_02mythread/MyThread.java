package com.zwb.part1._02mythread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 13:41
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
