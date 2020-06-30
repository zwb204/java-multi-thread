package part3_1._6notifyHoldLock;

/**
 * @Desc:
 * 必须执行完notify()方法所在的同步synchronized代码块后才释放锁
 *
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:48
 **/
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
        c.start();
    }
}
