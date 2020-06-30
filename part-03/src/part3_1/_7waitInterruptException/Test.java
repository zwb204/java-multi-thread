package part3_1._7waitInterruptException;

/**
 * @Desc:
 * 当线程为wait()状态时，调用线程对象的interrupt()方法会出现InterruptedException异常
 *
 * 遇到异常而线程终止，锁也会被释放
 *
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:48
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(3000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
