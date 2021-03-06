package com.zwb.part2._38setNewPropertiesLockOne;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 21:00
 **/
public class ThreadA extends Thread {
    private Service service;
    private UserInfo userInfo;

    public ThreadA(Service service, UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
