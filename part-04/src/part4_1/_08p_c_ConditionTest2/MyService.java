package part4_1._08p_c_ConditionTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 10:27
 **/
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;
    public void set() {
        try {
            lock.lock();
            while (hasValue == true) {
                System.out.println("有可能(●ˇ∀ˇ●)连续");
                condition.await();
            }
            System.out.println("打印(●ˇ∀ˇ●)");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (hasValue == false) {
                System.out.println("有可能(*≧︶≦))(￣▽￣* )ゞ连续");
                condition.await();
            }
            System.out.println("打印(*≧︶≦))(￣▽￣* )ゞ");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
