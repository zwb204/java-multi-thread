package com.zwb.part2._25synTwoLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:54
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
        service.printA();
    }
}
