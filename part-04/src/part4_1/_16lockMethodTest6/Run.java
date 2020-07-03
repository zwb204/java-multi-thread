package part4_1._16lockMethodTest6;

/**
 * @Desc:
 * lock.isFair()判断是不是公平锁
 * 在默认的情况下，ReentrantLock使用的是非公平锁
 * @Author: zwb
 * @CreateTime: 2020/7/3 9:33
 **/
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        thread = new Thread(runnable);
        thread.start();
    }
}
