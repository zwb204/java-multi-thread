package part4_2._02ReadWriteLockBegin2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 14:58
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
