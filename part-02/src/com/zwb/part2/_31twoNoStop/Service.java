package com.zwb.part2._31twoNoStop;

/**
 * @Desc:
 * 使用同步代码块来解决同步方法造成的死锁
 * @Author: zwb
 * @CreateTime: 2020/6/21 15:22
 **/
public class Service {
    Object object1 = new Object();
    public void methodA() {
        synchronized (object1) {
            System.out.println("mehtodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("methodA end");
        }
    }

    Object object2 = new Object();
    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
