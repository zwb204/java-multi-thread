package part4_1._14lockMethodTest5;

/**
 * @Desc:
 * hasWaiters(Condition condition)查询是否有线程正在等待与此锁定有关的condition条件。
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 8:40
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
        for (int i = 0;i<10;i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0;i<10;i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notityMethod();
    }
}
