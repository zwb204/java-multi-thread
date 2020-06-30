package part3_1._8notifyOne;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/24 10:32
 **/
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
            lock.notify();
        }
    }
}
