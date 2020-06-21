package com.zwb.part2._21syn_not_this1;

/**
 * @Desc:
 * 当多个线程同时执行synchronized(x){}同步代码块时呈同步效果
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:46
 **/
public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 ____getLock time="
                        + System.currentTimeMillis()
                        + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time="
                        + System.currentTimeMillis()
                        + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
