package com.zwb.part2._26synMoreObjectStaticOneLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:11
 **/
public class Service {
    public synchronized static void printA() {
        try {
            System.out.println("线程名称为："
                    + Thread.currentThread().getName()
                    + " 在 " + System.currentTimeMillis()
                    + " 进入printA" );
            Thread.sleep(3000);
            System.out.println("线程名称为："
                    + Thread.currentThread().getName()
                    + " 在 " + System.currentTimeMillis()
                    + " 离开printA" );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void printB() {

        System.out.println("线程名称为："
                + Thread.currentThread().getName()
                + " 在 " + System.currentTimeMillis()
                + " 进入printB" );
        System.out.println("线程名称为："
                + Thread.currentThread().getName()
                + " 在 " + System.currentTimeMillis()
                + " 离开printB" );
    }
}
