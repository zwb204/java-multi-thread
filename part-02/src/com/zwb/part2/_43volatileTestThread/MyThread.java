package com.zwb.part2._43volatileTestThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 14:02
 **/
public class MyThread extends Thread {
    public volatile static int count;

    //通过添加static和synchronized关键字达到同步的效果
    private synchronized static void addCount() {
        for (int i = 0;i < 100;i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
