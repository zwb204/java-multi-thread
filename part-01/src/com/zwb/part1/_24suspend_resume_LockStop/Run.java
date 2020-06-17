package com.zwb.part1._24suspend_resume_LockStop;

/**
 * @Desc:
 * 程序运行到println()方法内部被暂停时，同步锁未被释放，使得main()方法中的println也不能执行
 *
 * @Author: zwb
 * @CreateTime: 2020/6/17 16:15
 **/
public class Run {
    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(10000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
