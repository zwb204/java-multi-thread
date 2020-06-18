package com.zwb.part2._04synchronizedMethodLockObject;

/**
 * @Desc:
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
