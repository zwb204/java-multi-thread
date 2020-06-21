package com.zwb.part2._16synchronizedThis;

/**
 * @Desc:
 * 和synchronized方法一样，synchronized(this)代码块也是锁定当前对象的
 *
 * @Author: zwb
 * @CreateTime: 2020/6/19 15:57
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(10);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
