package com.zwb.part2._23syn_not_this3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:54
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
        object.speedPrintString();
    }
}
