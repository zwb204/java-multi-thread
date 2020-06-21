package com.zwb.part2._23syn_not_this3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:54
 **/
public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
