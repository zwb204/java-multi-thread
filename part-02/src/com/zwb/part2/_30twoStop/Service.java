package com.zwb.part2._30twoStop;

/**
 * @Desc:
 * 同步方法容易造成死锁
 * @Author: zwb
 * @CreateTime: 2020/6/21 15:22
 **/
public class Service {
    public synchronized void methodA() {
        System.out.println("mehtodA begin");
        boolean isContinueRun = true;
        while (isContinueRun) {
        }
        System.out.println("methodA end");
    }

    public synchronized void methodB() {
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
