package com.zwb.part1._15interrupted;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:19
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
