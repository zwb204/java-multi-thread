package com.zwb.part1._12sleep;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:49
 **/
public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end=" + System.currentTimeMillis());
    }

}
