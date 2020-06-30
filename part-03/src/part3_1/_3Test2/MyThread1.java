package part3_1._3Test2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 10:41
 **/
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始  wait  time="+System.currentTimeMillis());
                lock.wait();
                System.out.println("结束  wait  time="+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
