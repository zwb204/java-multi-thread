package com.zwb.part2._06dirtyRead;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 11:05
 **/
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName()
                    + " username=" + username
                    + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*synchronized*/ public void getValue() {
        System.out.println("getValue method thread name="
                + Thread.currentThread().getName()
                + " username=" + username
                + " password=" + password);
    }
}
