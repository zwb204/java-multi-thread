package com.zwb.part1._22suspend_resume_test;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 14:55
 **/
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
