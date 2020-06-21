package com.zwb.part2._21syn_not_this1;

/**
 * @Desc:
 * 使用同一个对象监视器
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:58
 **/
public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("B");
        b.start();
    }
}
