package part4_1._17isHeldByCurrentThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 9:52
 **/
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            System.out.println(lock.isHeldByCurrentThread());
            lock.unlock();
            System.out.println(lock.isHeldByCurrentThread());
        }
    }
}
