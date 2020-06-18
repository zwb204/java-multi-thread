package com.zwb.part2._08synLockIn2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 13:48
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
