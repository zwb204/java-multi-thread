package com.zwb.part2._46synchronizedUpdateNewValue;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 16:22
 **/
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB(service);
            b.start();
            System.out.println("已发起停止的命令");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
