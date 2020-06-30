package part3_1._9notifyAll;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:45
 **/
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
