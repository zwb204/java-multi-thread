package com.zwb.part2._35innerTest1;

/**
 * @Desc:
 *
 * 持有不同的“对象监视器”
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 20:05
 **/
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.mehthod1();
            }
        },"A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();

    }
}
