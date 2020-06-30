package part3_1._12waitOld;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:45
 **/
public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
