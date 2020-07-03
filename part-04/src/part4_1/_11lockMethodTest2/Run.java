package part4_1._11lockMethodTest2;

/**
 * @Desc:
 * getQueueLength()的作用是返回正在等待获取此锁定的线程估计数
 * @Author: zwb
 * @CreateTime: 2020/7/2 14:32
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0;i < 10;i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0;i < 10;i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁");
    }
}
