package com.zwb.part1._23suspend_resume_deal_lock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 16:01
 **/
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(2000);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString方法！只打印一个begin");
                    System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
