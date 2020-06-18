package com.zwb.part2._07synLockIn;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 13:09
 **/
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }
    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }
    synchronized public void service3() {
        System.out.println("service3");
    }
}
