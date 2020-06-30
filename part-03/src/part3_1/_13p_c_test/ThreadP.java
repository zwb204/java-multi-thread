package part3_1._13p_c_test;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:24
 **/
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
