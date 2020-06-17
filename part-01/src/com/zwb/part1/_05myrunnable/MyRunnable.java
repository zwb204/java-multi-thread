package com.zwb.part1._05myrunnable;

/**
 * @Desc:
 * 使用实现Runnable接口的方式来实现多线程技术
 * Thread.java类也实现了Runnable接口
 * @Author: zwb
 * @CreateTime: 2020/6/16 15:15
 **/
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("运行中");
    }
}
