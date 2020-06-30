package part3_1._6notifyHoldLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:54
 **/
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() +" begin wait");
                lock.wait();
                System.out.println(Thread.currentThread().getName() +" end   wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() +" begin notify"
                        + " time=" + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() +" end   notify"
                        + " time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
