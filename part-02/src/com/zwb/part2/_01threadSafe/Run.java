package com.zwb.part2._01threadSafe;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:21
 **/
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
