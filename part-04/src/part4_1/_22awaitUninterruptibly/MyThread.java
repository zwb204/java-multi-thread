package part4_1._22awaitUninterruptibly;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 13:04
 **/
public class MyThread extends Thread {
    private Service service;

    public MyThread (Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMehtod();
    }
}
