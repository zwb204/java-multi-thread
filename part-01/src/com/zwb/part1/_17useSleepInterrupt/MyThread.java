package com.zwb.part1._17useSleepInterrupt;


/**
 * @Desc:
 * 在sleep状态下停止某一线程，会进入catch语句，并且清除停止状态值，使之变成false
 * @Author: zwb
 * @CreateTime: 2020/6/17 11:09
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
