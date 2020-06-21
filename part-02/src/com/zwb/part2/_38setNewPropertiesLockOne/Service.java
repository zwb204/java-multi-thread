package com.zwb.part2._38setNewPropertiesLockOne;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 20:54
 **/
public class Service {
    public void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
