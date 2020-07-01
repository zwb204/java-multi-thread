package part3_2._06join_sleep_2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:40
 **/
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                b.join(); //说明join释放锁了
                for (int i = 0;i<Integer.MAX_VALUE;i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
