package part4_1._12lockMethodTest3;

/**
 * @Desc:
 * getWaitQueueLength(Condition condition)的作用是返回等待与此锁定相关的给定条件Condition的线程估计数。
 * @Author: zwb
 * @CreateTime: 2020/7/2 14:52
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10;i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10;i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notityMethod();
    }
}
