package part4_1._21tryLock2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 11:31
 **/
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + "调用waitMethod时间：" + System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.start();
    }
}
