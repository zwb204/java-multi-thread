package com.zwb.part2._02threadNotSafe;

/**
 * @Desc:
 * 两个线程同时访问一个没有同步的方法，如果两个线程通知操作业务对象的实例变量，
 * 则可能出现”非线程安全“问题
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:21
 **/
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
