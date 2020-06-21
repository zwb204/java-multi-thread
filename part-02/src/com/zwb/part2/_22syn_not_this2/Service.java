package com.zwb.part2._22syn_not_this2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:11
 **/
public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 ____getLock time="
                        + System.currentTimeMillis()
                        + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(5000);
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
