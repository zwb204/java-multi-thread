package com.zwb.part1._15interrupted;

/**
 * @Desc:
 * interrupted()
 * 测试当前线程是否已经中断。线程的中断状态由该方法清除。
 * 所以连续两次调用该方法，则第二次调用将返回false
 * @Author: zwb
 * @CreateTime: 2020/6/17 10:27
 **/
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1 ? = " + Thread.interrupted());
        System.out.println("是否停止2 ? = " + Thread.interrupted());
        System.out.println("end");
    }
}
