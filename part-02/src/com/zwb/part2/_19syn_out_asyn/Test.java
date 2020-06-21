package com.zwb.part2._19syn_out_asyn;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:33
 **/
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(myList);
        b.setName("B");
        b.start();
    }
}
