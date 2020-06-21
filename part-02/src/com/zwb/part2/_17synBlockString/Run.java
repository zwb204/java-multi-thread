package com.zwb.part2._17synBlockString;

/**
 * @Desc:
 * 在多个线程持有”对象监视器“为同一个对象的前提下，同一时间只能有一个线程可以执行synchronized(非this对象x)同步代码块中的代码
 *
 * @Author: zwb
 * @CreateTime: 2020/6/19 13:40
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
