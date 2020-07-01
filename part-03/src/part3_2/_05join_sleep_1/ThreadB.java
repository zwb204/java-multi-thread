package part3_2._05join_sleep_1;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:41
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("  b run begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  b run   end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void bService() {
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }
}
