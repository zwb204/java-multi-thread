package com.zwb.part2._38setNewPropertiesLockOne;

/**
 * @Desc:
 * 只要对象不变，即使对象的属性被改变，运行的结果还是同步的
 *
 * @Author: zwb
 * @CreateTime: 2020/6/21 12:57
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        UserInfo userInfo = new UserInfo();
        ThreadA a = new ThreadA(service,userInfo);
        ThreadB b = new ThreadB(service,userInfo);

        a.start();
        Thread.sleep(50);
        b.start();
    }
}
