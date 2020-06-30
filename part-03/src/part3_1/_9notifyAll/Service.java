package part3_1._9notifyAll;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/24 10:30
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

}
