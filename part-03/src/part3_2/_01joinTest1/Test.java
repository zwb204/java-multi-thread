package part3_2._01joinTest1;

/**
 * @Desc:
 * 方法join的作用是使所属线程对象x正常执行run()方法中的任务，而使当前线程z进行无限期的阻塞，
 * 等待线程x销毁后再继续执行线程z后面的代码。
 *
 * 方法join具有使线程排队运行的作用，有些类似同步的运行效果。
 * join和synchronized的区别是：join内部使用wait()方法进行等待，而synchronized关键字使用的是“对象监视器”原理作为同步。
 *
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:00
 **/
public class Test {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
//            myThread.join();
            Thread.sleep(100);
            System.out.println("无法确定sleep的值为多少才能保证threadTest先执行完");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
