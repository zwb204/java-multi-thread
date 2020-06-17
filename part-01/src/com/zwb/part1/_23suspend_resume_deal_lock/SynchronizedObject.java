package com.zwb.part1._23suspend_resume_deal_lock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 15:10
 **/
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
