package part4_1._07UseManyConditionRight;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 9:12
 **/
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
