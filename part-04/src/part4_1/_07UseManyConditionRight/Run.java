package part4_1._07UseManyConditionRight;

/**
 * @Desc:
 * ReentrantLock对象可以唤醒指定种类的线程。
 *
 * @Author: zwb
 * @CreateTime: 2020/7/2 10:08
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}
