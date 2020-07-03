package part4_1._04UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * 通过ReentrantLock和Condition对象相结合，可以实现等待/通知模式。
 * 而且Condition具有更好的灵活性，比如可以实现多路通过功能，就是在一个Lock对象里面可以创建多个Condition（即对象监视器）实例，
 * 线程对象可以注册在指定的Condition中，从而可以有选择的进行线程通知。
 *
 * synchronized就相当于整个Lock对象中只有一个单一的Condition对象，所有线程都注册在它一个对象的身上。
 * 线程开始notifyAll()时，需要通知所有的WAITING线程，没有选择权，会出现很大的效率问题
 *
 * 在condition.await()方法调用之前，必须要调用lock.lock()代码获得同步监视器。
 *
 * @Author: zwb
 * @CreateTime: 2020/7/2 9:09
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod() {
        try {
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }
}
