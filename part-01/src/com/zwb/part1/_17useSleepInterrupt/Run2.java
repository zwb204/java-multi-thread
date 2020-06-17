package com.zwb.part1._17useSleepInterrupt;

/**
 * @Desc:
 * 主线程先执行完了代码，给子线程打了停止标记，当子线程执行时，线程停止了再执行sleep方法，会进入catch
 * @Author: zwb
 * @CreateTime: 2020/6/17 11:24
 **/
public class Run2 {
    public static void main(String[] args) {
        MyThread2 thread = new MyThread2();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
