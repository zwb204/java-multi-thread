package com.zwb.part1._09currentThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 23:24
 **/
public class MyThread extends Thread {

    protected MyThread() {
        System.out.println("构造方法打印：" + Thread.currentThread().getName());
        System.out.println("构造方法，this.getName()：" + this.getName());
    }

    @Override
    public void run() {
        System.out.println("run方法打印：" + Thread.currentThread().getName());
        System.out.println("run方法，this.getName()：" + this.getName());
    }
}
