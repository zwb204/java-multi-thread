package part4_1._24awaitUntil;

/**
 * @Desc:
 *
 * 线程在等待时间到达前，可以被其他线程提前唤醒
 *
 * @Author: zwb
 * @CreateTime: 2020/7/3 13:26
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(2000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
