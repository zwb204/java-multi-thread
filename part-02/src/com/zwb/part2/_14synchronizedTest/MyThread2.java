package com.zwb.part2._14synchronizedTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 11:33
 **/
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
