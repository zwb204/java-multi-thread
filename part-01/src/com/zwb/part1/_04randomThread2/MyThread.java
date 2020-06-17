package com.zwb.part1._04randomThread2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 14:52
 **/
public class MyThread extends Thread {

    private int i;
    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
