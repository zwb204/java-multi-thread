package com.zwb.part2._41threadRunnable2;

/**
 * @Desc: 解决同步死循环
 * 利用多线程来终止死循环
 *
 * 但本代码运行在-server服务器模式中64bit的JVM上时，会出现死循环。
 * 解决方法是使用volatile关键字
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 21:41
 **/
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
