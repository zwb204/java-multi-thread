package com.zwb.part2._04synchronizedMethodLockObject;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:59
 **/
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
