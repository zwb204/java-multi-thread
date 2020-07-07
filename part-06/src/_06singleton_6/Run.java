package _06singleton_6;

/**
 * @Desc:
 * 延迟加载（懒汉模式）
 * 延迟就在就是在调用get()方法的时候实例才被创建，常见的方法就是在get()方法中进行new实例化
 *
 * 但在多线程环境下，会出现取得多个实例的情况.
 *
 * 可通过加synchronized的方法解决，但效率较低
 *
 * 通过DCL方法解决
 *
 * 通过内部类解决
 *
 * @Author: zwb
 * @CreateTime: 2020/7/6 15:35
 **/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
