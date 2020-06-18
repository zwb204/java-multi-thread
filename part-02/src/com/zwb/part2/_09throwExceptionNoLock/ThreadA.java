package com.zwb.part2._09throwExceptionNoLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 11:18
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
