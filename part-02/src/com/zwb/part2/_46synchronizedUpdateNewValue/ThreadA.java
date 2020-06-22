package com.zwb.part2._46synchronizedUpdateNewValue;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 16:19
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
