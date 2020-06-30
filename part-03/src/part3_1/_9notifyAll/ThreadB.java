package part3_1._9notifyAll;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:45
 **/
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
