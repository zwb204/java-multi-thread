package com.zwb.part2._18synBlockString2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:06
 **/
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
