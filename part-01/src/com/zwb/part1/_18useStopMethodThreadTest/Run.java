package com.zwb.part1._18useStopMethodThreadTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 13:34
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
