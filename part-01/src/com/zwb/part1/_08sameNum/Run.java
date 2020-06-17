package com.zwb.part1._08sameNum;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 23:13
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread aa = new Thread(myThread);
        Thread bb = new Thread(myThread);
        Thread cc = new Thread(myThread);
        Thread dd = new Thread(myThread);
        Thread ee = new Thread(myThread);
        aa.start();
        bb.start();
        cc.start();
        dd.start();
        ee.start();
    }
}
