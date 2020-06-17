package com.zwb.part1._19runMethodUseStopMethod;

/**
 * @Desc:
 * 调用stop方法会抛出java.lang.ThreadDeath异常，但在通常情况下，此异常不需要显示捕捉
 * @Author: zwb
 * @CreateTime: 2020/6/17 13:38
 **/
public class MyThread extends Thread {
    @Override
    public void run() {

        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch方法");
            e.printStackTrace();
        }
    }
}
