package com.zwb.part2._01threadSafe;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:14
 **/
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
