package part4_1._24awaitUntil;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 13:24
 **/
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
