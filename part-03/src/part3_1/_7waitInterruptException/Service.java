package part3_1._7waitInterruptException;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/24 10:16
 **/
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait");
//                Thread.sleep(5000);
                lock.wait();
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为wait状态的线程被interrupt了");
        }
    }
}
