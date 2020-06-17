package com.zwb.part1._03randomThread;

import java.util.Map;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 13:49
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
