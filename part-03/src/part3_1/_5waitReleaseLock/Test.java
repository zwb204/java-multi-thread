package part3_1._5waitReleaseLock;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:48
 **/
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
