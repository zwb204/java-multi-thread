package com.zwb.part1._07threadsafe.extthread;

import com.zwb.part1._07threadsafe.controller.LoginServlet;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 22:59
 **/
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
