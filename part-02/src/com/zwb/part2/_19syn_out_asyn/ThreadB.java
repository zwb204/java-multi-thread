package com.zwb.part2._19syn_out_asyn;


/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:06
 **/
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadB" + (i + 1));
            list.add("threadB" + (i + 1));
        }
    }
}
