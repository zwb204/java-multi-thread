package com.zwb.part2._31twoNoStop;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 11:44
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodA();
    }
}