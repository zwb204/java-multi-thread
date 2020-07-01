package part3_3._01ThreadLocalTest1;

/**
 * @Desc:
 * 如何实现每个线程都有自己的共享变量？
 * ThreadLocal类主要解决的就是每个线程绑定自己的值(隔离性)，可以将ThreadLocal类比喻成全局存放数据的盒子，盒子之中可以存储每个线程的私有数据.
 * 不同线程的值放入ThreadLocal类中保存
 *
 *
 *
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:31
 **/
public class Run {

    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
