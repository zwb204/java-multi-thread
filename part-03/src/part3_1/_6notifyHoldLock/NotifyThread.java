package part3_1._6notifyHoldLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:45
 **/
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
