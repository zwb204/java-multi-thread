package part4_1._05UseConditionWaitNotifyOK2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 9:12
 **/
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
