package com.zwb.part2._18synBlockString2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 13:50
 **/
public class Service {
    private String anyString = new String();
    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }
}
