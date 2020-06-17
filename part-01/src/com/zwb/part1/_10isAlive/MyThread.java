package com.zwb.part1._10isAlive;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 9:16
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
