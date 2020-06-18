package com.zwb.part2._03twoObjectTwoLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 9:10
 **/
public class HasSelfPrivateNum {
    private int num = 0;  //成员变量
    synchronized public void addI (String username) {
        try {
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
