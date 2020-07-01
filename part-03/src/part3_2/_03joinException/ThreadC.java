package part3_2._03joinException;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:29
 **/
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
