package part4_1._20tryLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 11:11
 **/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }
}
