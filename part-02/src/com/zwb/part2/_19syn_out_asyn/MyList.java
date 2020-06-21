package com.zwb.part2._19syn_out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 14:18
 **/
public class MyList {
    private List list = new ArrayList();
    public synchronized void add(String usrname) {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了add方法");
        list.add(usrname);
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了add方法");
    }
    public synchronized int getSize() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了getSize方法");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了getSize方法");
        return sizeValue;
    }

}
