package com.zwb.part1._20stopThrowLock;

/**
 * @Desc:
 * 主线程调用构造方法，子线程启动，sleep500的过程中，子线程执行run()方法，
 * 其中调用printString（）方法，在为username赋值b后，sleep100000，
 * 在此过程中主线程sleep500结束，stop（）子线程，导致接下来password的赋值无法完成
 * @Author: zwb
 * @CreateTime: 2020/6/17 14:12
 **/
public class Run {
    public static void main(String[] args) {

        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
