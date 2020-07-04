package part4_2._04ReadWriteLockBegin4;

/**
 * @Desc:
 * 写读互斥
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 14:57
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
