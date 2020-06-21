package com.zwb.part2._12synchronizedOneThreadIn;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 10:59
 **/
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
