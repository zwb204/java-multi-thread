package com.zwb.part2._16synchronizedThis;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 15:38
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
        task.otherMethod();
    }
}
