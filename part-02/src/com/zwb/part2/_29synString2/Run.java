package com.zwb.part2._29synString2;

/**
 * @Desc:
 * 由于String常量池的存在，两个线程持有相同的锁，所以B线程无法执行。
 * 大多数情况下，synchronized同步代码块都不使用String作为锁对象,
 * 可以new Object()实例化一个Object对象，它不放入缓存
 * @Author: zwb
 * @CreateTime: 2020/6/21 12:57
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
