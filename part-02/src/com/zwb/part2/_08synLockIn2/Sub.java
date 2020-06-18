package com.zwb.part2._08synLockIn2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 13:29
 **/
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(1000);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
