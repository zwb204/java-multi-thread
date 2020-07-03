package part4_1._23awaitUninterruptibly2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 11:46
 **/
public class Service {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void testMehtod() {
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.awaitUninterruptibly();
            System.out.println("wait   end");
        } finally {
            lock.unlock();
        }
    }
}
