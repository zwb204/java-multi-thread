package part3_2._07joinTest3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:59
 **/
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                System.out.println("begin A ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end A ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
