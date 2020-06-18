package com.zwb.part2._10synNotExtends;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 14:31
 **/
public class Main {
    public synchronized void serviceMethod() {
        try {
            System.out.println("int main 下一步sleep begin threadName="
                    + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep end threadName="
                    + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
