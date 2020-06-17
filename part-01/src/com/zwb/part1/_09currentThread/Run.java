package com.zwb.part1._09currentThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 23:26
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        Thread t1 = new Thread(myThread);
//        t1.setName("t1");
        //myThread.run();
        myThread.start();
//        t1.start();
    }
}
