package part3_1._2test;

/**
 * @Desc:
 * wait()方法的作用是使当前执行代码的线程进行等待，wait()方法是Object类的方法，
 * 用来将当前线程置入“预执行队列”中，并且在wait()所在的代码行处停止执行，直到接到通知或被中断为止。
 *
 * 在调用wait()之前，线程必须获得该对象的对象级别锁，即只能在同步方法或同步块中调用wait()方法。
 * 在执行wait()方法后，当前线程释放锁。
 * 在从wait()返回前，线程与其他线程竞争重新获得锁。
 * 如果调用wait()方法时没有持有适当的锁，则抛出IllegalMonitorStateException，它是RuntimeException的子类。
 *
 * @Author: zwb
 * @CreateTime: 2020/6/23 10:25
 **/
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString  = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
