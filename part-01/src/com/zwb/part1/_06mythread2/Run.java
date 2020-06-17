package com.zwb.part1._06mythread2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 18:35
 **/
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();

        System.out.println("++++++++++++++++++++++");

        MyThread2 myThread2 = new MyThread2();
        Thread aa = new Thread(myThread2,"a");
        Thread bb = new Thread(myThread2,"b");
        Thread cc = new Thread(myThread2,"c");
        Thread dd = new Thread(myThread2,"d");
        Thread ee = new Thread(myThread2,"e");
        aa.start();
        bb.start();
        cc.start();
        dd.start();
        ee.start();
    }
}
