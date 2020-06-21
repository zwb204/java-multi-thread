package com.zwb.part2._24synStaticMethod;

/**
 * @Desc:
 * 关键字synchronized应用在static静态方法上，是对当前*.java文件对应的Class类文件进行持锁
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:24
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
