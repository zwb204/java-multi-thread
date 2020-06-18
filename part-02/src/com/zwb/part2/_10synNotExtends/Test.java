package com.zwb.part2._10synNotExtends;


/**
 * @Desc:
 * 同步不能继承，还是得在子类中添加synchrozied关键字
 * @Author: zwb
 * @CreateTime: 2020/6/18 14:42
 **/
public class Test {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        ThreadA a = new ThreadA(subRef);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
