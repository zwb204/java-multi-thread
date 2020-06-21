package com.zwb.part2._17synBlockString;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 13:32
 **/
public class Service {
    private String usernameParam;
    private String passwordparam;

//    private String anyString = new String();

    public void setUsernamePassword(String username,String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("线程名称："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步块" );
                usernameParam = username;
                Thread.sleep(3000);
                passwordparam = password;
                System.out.println("线程名称："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步块" );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
