package com.zwb.part1._06mythread2;

/**
 * @Desc:  线程间不共享数据
 * @Author: zwb
 * @CreateTime: 2020/6/16 18:31
 **/
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name); //设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(this.currentThread().getName() + "计算，count=" + count);
        }
    }
}
