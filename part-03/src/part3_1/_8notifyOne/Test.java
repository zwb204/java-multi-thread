package part3_1._8notifyOne;

/**
 * @Desc:
 * notify()仅随机唤醒一个线程
 *
 * @Author: zwb
 * @CreateTime: 2020/6/24 10:37
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
