package part4_1._21tryLock2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 11:27
 **/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName()
                        + "获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println(Thread.currentThread().getName() + "没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
