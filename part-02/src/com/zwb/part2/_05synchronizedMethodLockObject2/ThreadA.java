package com.zwb.part2._05synchronizedMethodLockObject2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 10:11
 **/
public class ThreadA extends Thread {
    private MyObject object;
    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
