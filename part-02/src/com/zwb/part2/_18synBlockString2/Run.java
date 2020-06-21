package com.zwb.part2._18synBlockString2;

/**
 * @Desc:
 * 对象监视器不同，运行结果是异步的
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:09
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
