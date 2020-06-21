package com.zwb.part2._15doubleSynBlockOneTwo;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:47
 **/
public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA (ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
