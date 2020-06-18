package com.zwb.part2._10synNotExtends;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 14:37
 **/
public class Sub extends Main {

    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub 下一步sleep begin threadName="
                    + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步sleep end threadName="
                    + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
