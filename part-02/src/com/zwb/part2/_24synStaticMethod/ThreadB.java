package com.zwb.part2._24synStaticMethod;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:31
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
