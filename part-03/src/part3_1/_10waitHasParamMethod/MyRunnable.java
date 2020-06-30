package part3_1._10waitHasParamMethod;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/24 10:48
 **/
public class MyRunnable {
    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() +" begin wait time=" + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println(Thread.currentThread().getName() +" end   wait time=" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable1);
        t.start();
    }
}
