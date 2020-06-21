package com.zwb.part2._12synchronizedOneThreadIn;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 10:52
 **/
public class ObjectService {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
