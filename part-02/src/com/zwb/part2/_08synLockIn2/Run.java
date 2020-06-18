package com.zwb.part2._08synLockIn2;

/**
 * @Desc:
 *当存在类继承关系时，子类可以通过”可重入锁“调用父类的同步方法
 * @Author: zwb
 * @CreateTime: 2020/6/18 13:51
 **/
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
