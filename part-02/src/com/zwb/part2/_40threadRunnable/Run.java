package com.zwb.part2._40threadRunnable;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 21:41
 **/
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
