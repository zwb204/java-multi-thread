package com.zwb.part1._24suspend_resume_LockStop;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 16:12
 **/
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
