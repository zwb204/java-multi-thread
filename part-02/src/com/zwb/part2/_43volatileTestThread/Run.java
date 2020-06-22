package com.zwb.part2._43volatileTestThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 14:04
 **/
public class Run {
    public static void main(String[] args) {
        MyThread[] mythreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            mythreadArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            mythreadArray[i].start();
        }
    }
}
