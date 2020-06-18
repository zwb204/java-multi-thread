package com.zwb.part1._29daemonThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 8:37
 **/
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
