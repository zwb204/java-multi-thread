package com.zwb.part2._30twoStop;

/**
 * @Desc:
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 12:57
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
