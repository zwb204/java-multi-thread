package _10singleton_10;

/**
 * @Desc:
 * enum实现单例
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
