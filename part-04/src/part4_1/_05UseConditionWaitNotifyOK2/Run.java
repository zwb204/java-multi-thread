package part4_1._05UseConditionWaitNotifyOK2;

/**
 * @Desc:
 * 成功实现等待/通知模式
 * Object类中的wait()方法相当于Condition类中的await()方法。
 * Object类中的wait(long timeout)方法相当于Condition类中的await(long time，TimeUnit unit)方法。
 * Object类中的notify()方法相当于Condition类中的signal()方法。
 * Object类中的notifyAll()方法相当于Condition类中的signalAll()方法。
 *
 * @Author: zwb
 * @CreateTime: 2020/7/2 9:14
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
