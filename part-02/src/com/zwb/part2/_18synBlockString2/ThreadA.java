package com.zwb.part2._18synBlockString2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:06
 **/
public class ThreadA extends Thread {
    private Service service;
    public ThreadA (Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
