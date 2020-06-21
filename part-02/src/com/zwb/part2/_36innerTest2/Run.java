package com.zwb.part2._36innerTest2;

/**
 * @Desc:
 *
 * synchronized(class2)对class2上锁后，其他线程只能以同步的方式调用class2的静态方法
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 20:05
 **/
public class Run {
    public static void main(String[] args) {
        final OutClass.InnerClass1 inner1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 inner2 = new OutClass.InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner1.mehthod1(inner2);
            }
        },"T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner1.method2();
            }
        },"T2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner2.method1();
            }
        },"T3");
        t1.start();
        t2.start();
        t3.start();

    }
}
