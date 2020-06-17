package com.zwb.part1._07threadsafe;

import com.zwb.part1._07threadsafe.extthread.ALogin;
import com.zwb.part1._07threadsafe.extthread.BLogin;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 23:02
 **/
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
