package com.zwb.part1._24suspend_resume_nosameValue;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/17 16:41
 **/
public class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u,String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }
    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
