package com.zwb.part2._11synchronizedDisadvantage;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 10:06
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
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
