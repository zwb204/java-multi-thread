package part3_1._6notifyHoldLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 15:02
 **/
public class SynNotifyMethodThread extends Thread {

    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
