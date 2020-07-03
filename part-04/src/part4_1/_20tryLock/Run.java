package part4_1._20tryLock;

/**
 * @Desc:
 *
 * tryLock()：仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 11:14
 **/
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.start();
    }
}
