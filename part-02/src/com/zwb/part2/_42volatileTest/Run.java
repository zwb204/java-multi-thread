package com.zwb.part2._42volatileTest;

/**
 * @Desc: 解决同步死循环
 * 利用多线程来终止死循环
 *
 * 但本代码运行在-server服务器模式中64bit的JVM上时，会出现死循环。
 * 解决方法是使用volatile关键字
 *
 * 在启动RunThread.java线程时，变量private boolean isRunning = true；存在于公共堆栈和线程的私有堆栈中。
 * 而JVM被设置为-server模式时，为了线程运行效率，线程一直在私有堆栈获取isRunning的值，为true；
 * 而代码runThread.setRunning(false)执行后，更新的是公共堆栈中的isRunning,这样就会陷入死循环
 *
 * 通过volatile关键字可解决私有堆栈和公共堆栈中值不同步的问题。
 * 它的主要作用是当线程访问isRunning这个变量时，强制性的从公共堆栈中取值。
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 21:41
 **/
public class Run {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
