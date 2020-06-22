package com.zwb.part2._45atomicIntegerNoSafe;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 14:42
 **/
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
