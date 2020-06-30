package part3_1._3Test2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 10:41
 **/
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始notify  time="+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify  time="+System.currentTimeMillis());
        }
    }
}
