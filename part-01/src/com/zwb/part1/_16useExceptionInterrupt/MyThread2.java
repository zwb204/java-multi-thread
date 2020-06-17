package com.zwb.part1._16useExceptionInterrupt;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:59
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了，我要退出了");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("for又继续运行，线程并未停止");
    }
}
