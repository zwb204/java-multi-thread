package part4_1._13lockMethodTest4;

/**
 * @Desc:
 * hasQueuedThread(Thread thread)：查询指定的线程是否正在等待获取此锁定。
 * hasQueuedThreads()：查询是否有线程正在等待获取此锁定。
 *
 * @Author: zwb
 * @CreateTime: 2020/7/2 15:13
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
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
