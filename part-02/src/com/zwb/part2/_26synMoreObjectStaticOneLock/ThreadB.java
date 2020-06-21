package com.zwb.part2._26synMoreObjectStaticOneLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 11:44
 **/
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}