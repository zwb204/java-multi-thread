package part3_2._07joinTest3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:41
 **/
public class ThreadB extends Thread {
    @Override
    public synchronized void run() {
        try {
            System.out.println("begin B ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
