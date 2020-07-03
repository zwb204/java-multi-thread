package part4_1._09Fair_noFair_test;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 11:32
 **/
public class RunNotFair {
    public static void main(String[] args) {

        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("+++线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0;i < 10;i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0;i < 10;i++) {
            threadArray[i].start();
        }
    }
}
