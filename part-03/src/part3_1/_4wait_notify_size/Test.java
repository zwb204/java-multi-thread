package part3_1._4wait_notify_size;


/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 17:23
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
