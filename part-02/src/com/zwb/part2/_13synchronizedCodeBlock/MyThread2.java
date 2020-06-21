package com.zwb.part2._13synchronizedCodeBlock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 10:06
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
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
