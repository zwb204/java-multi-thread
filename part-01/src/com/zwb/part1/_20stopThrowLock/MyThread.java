package com.zwb.part1._20stopThrowLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 14:09
 **/
public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }
}
