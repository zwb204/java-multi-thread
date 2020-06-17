package com.zwb.part1._12sleep;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:44
 **/
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end=" + System.currentTimeMillis());
    }
}
