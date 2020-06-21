package com.zwb.part2._20syn_out_asyn2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 16:24
 **/
public class MyOneList {
    private List list = new ArrayList();
    public synchronized void add(String data) {
        list.add(data);
    }
    public synchronized int getSize() {
        return list.size();
    }
}
