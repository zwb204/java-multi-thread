package part4_1._01ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 11:34
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod() {
        lock.lock();
        for (int i = 0;i<5;i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i+1)));
        }
        lock.unlock();
    }
}
