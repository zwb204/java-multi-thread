package part4_1._02ConditionTestMoreMethod;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 16:37
 **/
public class ThreadBB extends Thread {
    private MyService service;
    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
