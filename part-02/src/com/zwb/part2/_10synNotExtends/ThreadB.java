package com.zwb.part2._10synNotExtends;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/18 11:18
 **/
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
