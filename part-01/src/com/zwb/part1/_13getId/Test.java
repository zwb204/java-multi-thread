package com.zwb.part1._13getId;

/**
 * @Desc:
 * getId()方法的作用是取得线程的唯一标识
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:02
 **/
public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
