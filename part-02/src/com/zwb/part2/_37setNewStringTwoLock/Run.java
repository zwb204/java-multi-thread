package com.zwb.part2._37setNewStringTwoLock;

/**
 * @Desc:
 * Thread0线程获得的锁是123,在sleep 50毫秒后，Thread1获得的锁是456
 * @Author: zwb
 * @CreateTime: 2020/6/21 12:57
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);

        a.start();
        Thread.sleep(50);
        b.start();
    }
}
