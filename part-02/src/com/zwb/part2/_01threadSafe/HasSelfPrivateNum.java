package com.zwb.part2._01threadSafe;

/**
 * @Desc:
 * "非线程安全"问题存在于”实例变量“中，
 * 对于方法内部的私有变量，则不存在”非线程安全“问题。
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:10
 **/
public class HasSelfPrivateNum {
    public void addI (String username) {
        try {
            int num = 0;  //局部变量
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
