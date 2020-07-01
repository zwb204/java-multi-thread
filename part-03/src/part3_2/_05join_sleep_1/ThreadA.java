package part3_2._05join_sleep_1;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:40
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
                b.start();
                Thread.sleep(6000);
//            Thread.sleep(); 不释放锁
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
