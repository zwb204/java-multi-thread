package com.zwb.part2._26synMoreObjectStaticOneLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:33
 **/
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();

        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }

}
