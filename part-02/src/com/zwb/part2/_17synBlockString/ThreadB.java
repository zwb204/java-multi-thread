package com.zwb.part2._17synBlockString;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 13:38
 **/
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b","bb");
    }
}
