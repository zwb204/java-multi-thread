package com.zwb.part1._11isAliveOtherTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:31
 **/
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
