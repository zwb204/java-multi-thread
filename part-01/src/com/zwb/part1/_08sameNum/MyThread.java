package com.zwb.part1._08sameNum;

/**
 * @Desc:
 * 虽然println（）方法在内部是同步的，但i--的操作却是在进入println（）之前发生的
 * 所以整体来说还是不同步的
 * @Author: zwb
 * @CreateTime: 2020/6/16 23:11
 **/
public class MyThread extends Thread {

    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}
