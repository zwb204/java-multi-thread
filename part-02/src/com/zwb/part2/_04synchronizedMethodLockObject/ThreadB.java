package com.zwb.part2._04synchronizedMethodLockObject;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 10:22
 **/
public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
