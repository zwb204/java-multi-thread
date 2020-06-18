package com.zwb.part1._29daemonThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 8:43
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(6000);
            System.out.println("我离开thread对象也不再打印了，就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
