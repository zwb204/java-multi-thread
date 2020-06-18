package com.zwb.part2._08synLockIn2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 13:22
 **/
public class Main {
    public int i = 10;
    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
