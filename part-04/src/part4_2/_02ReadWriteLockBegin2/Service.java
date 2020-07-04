package part4_2._02ReadWriteLockBegin2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 14:44
 **/
public class Service {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
