package com.zwb.part2._14synchronizedTest;

import com.zwb.part2._08synLockIn2.MyThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 11:33
 **/
public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
