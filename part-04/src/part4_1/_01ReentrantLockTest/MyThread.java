package part4_1._01ReentrantLockTest;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 11:47
 **/
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
