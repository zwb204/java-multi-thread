package part4_1._23awaitUninterruptibly2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/3 13:06
 **/
public class Run {
    public static void main(String[] args) {

        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
