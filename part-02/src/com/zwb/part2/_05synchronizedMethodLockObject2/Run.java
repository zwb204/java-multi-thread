package com.zwb.part2._05synchronizedMethodLockObject2;

/**
 * @Desc:
 * 1)A线程先持有object对象的Lock锁，B线程可以以异步的方法调用object对象中的非synchronized类型的方法。
 * 2)A线程先持有object对象的Lock锁，B线程如果在这时调用object对象的synchronized类型的方法则需要等待，也就是同步。
 * @Author: zwb
 * @CreateTime: 2020/6/18 10:23
 **/
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
