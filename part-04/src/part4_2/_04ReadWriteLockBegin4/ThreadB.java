package part4_2._04ReadWriteLockBegin4;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 14:58
 **/
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
