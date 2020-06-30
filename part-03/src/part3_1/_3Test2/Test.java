package part3_1._3Test2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 10:45
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
