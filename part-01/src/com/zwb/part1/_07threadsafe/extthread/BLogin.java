package com.zwb.part1._07threadsafe.extthread;

import com.zwb.part1._07threadsafe.controller.LoginServlet;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 23:01
 **/
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
