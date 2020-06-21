package com.zwb.part2._15doubleSynBlockOneTwo;

/**
 * @Desc:
 * 当一个线程返回object的一个synchronized(this)同步代码块时，
 * 其他线程对同一个object中所有其他sychronized(this)同步代码块的访问将被阻塞，
 * 即，synchronized使用的”对象监视器“是同一个。
 * @Author: zwb
 * @CreateTime: 2020/6/19 15:09
 **/
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
