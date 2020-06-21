package com.zwb.part2._20syn_out_asyn2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 16:30
 **/
public class MyThread2 extends Thread {
    private MyOneList list;
    public MyThread2(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"B");
    }
}
