package com.zwb.part2._23syn_not_this3;

/**
 * @Desc:
 * 使用同一个对象监视器
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:58
 **/
public class Run1_1 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("B");
        b.start();
    }
}
