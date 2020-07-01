package part3_2._05join_sleep_1;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:46
 **/
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
