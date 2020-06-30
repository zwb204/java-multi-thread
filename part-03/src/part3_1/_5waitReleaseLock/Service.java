package part3_1._5waitReleaseLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:41
 **/
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() +" begin wait");
                //Thread.sleep(3000);
                lock.wait();
                System.out.println(Thread.currentThread().getName() +" end   wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
