package part4_1._17isHeldByCurrentThread;

/**
 * @Desc:
 * isHeldByCurrentThread()的作用是查询当前线程是否保持此锁定
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 9:55
 **/
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
