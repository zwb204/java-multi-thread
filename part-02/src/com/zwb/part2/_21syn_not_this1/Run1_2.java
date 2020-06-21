package com.zwb.part2._21syn_not_this1;

/**
 * @Desc:
 * 使用不同的对象监视器
 * @Author: zwb
 * @CreateTime: 2020/6/20 20:58
 **/
public class Run1_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        ThreadA a = new ThreadA(service,object1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object2);
        b.setName("B");
        b.start();
    }
}
