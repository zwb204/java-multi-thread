package com.zwb.part1._14endThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:10
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }

    }
}
