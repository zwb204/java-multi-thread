package com.zwb.part2._24synStaticMethod;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/20 21:33
 **/
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }

}
