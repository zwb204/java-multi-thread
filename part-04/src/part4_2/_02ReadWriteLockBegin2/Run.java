package part4_2._02ReadWriteLockBegin2;

/**
 * @Desc:
 * 写写互斥
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 14:57
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
