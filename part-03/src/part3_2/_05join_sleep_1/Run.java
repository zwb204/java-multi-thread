package part3_2._05join_sleep_1;

/**
 * @Desc:
 * Thread.sleep()不会释放锁
 *
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:48
 **/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
