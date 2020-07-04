package part4_2._03ReadWriteLockBegin3;

/**
 * @Desc:
 * 读写互斥
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 14:57
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
