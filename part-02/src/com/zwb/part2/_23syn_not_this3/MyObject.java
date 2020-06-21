package com.zwb.part2._23syn_not_this3;

/**
 * @Desc:
 * 当其他线程执行x对象方法中synchronized(this)代码块时呈同步效果
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:06
 **/
public class MyObject {
    public void speedPrintString() {
        synchronized (this) {
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
}
