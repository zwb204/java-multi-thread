package com.zwb.part2._22syn_not_this2;

/**
 * @Desc:
 * 当其他线程执行x对象中synchronized同步方法时呈同步效果
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:06
 **/
public class MyObject {
    public synchronized void speedPrintString() {
        System.out.println("speedPrintString ____getLock time="
                + System.currentTimeMillis()
                + " run ThreadName="
                + Thread.currentThread().getName());
        System.out.println("--------------------");
        System.out.println("speedPrintString releaseLock time="
                + System.currentTimeMillis()
                + " run ThreadName="
                + Thread.currentThread().getName());
    }
}
