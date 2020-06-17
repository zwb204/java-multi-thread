package com.zwb.part1._07threadsafe.controller;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/16 22:56
 **/
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    public synchronized static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
