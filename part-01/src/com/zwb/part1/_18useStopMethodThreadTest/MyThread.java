package com.zwb.part1._18useStopMethodThreadTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 13:32
 **/
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
