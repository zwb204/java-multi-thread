package part4_1._02ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 16:32
 **/
public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA   end ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB   end ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
