package part4_1._19lockInterruptibly;

/**
 * @Desc:
 * lockInterruptibly()：若当前线程未被中断，则获取锁定，如果已经被中断则抛出异常
 * @Author: zwb
 * @CreateTime: 2020/7/3 10:36
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
        threadB.interrupt();
        System.out.println("main end");
    }
}
