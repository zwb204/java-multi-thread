package com.zwb.part2._42volatileTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 21:46
 **/
public class RunThread extends Thread {

    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入printStringMethod了");
        while (isRunning == true) {
        }
        System.out.println("线程停止了");
    }
}
