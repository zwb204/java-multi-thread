package com.zwb.part2._06dirtyRead;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 11:18
 **/
public class ThreadA extends Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
