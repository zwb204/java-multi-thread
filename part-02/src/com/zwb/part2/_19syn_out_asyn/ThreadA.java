package com.zwb.part2._19syn_out_asyn;


/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:06
 **/
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA" + (i + 1));
        }
    }
}
