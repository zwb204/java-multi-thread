package com.zwb.part1._05myrunnable;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 15:17
 **/
public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
