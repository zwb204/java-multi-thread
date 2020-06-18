package com.zwb.part2._02threadNotSafe;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:19
 **/
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
