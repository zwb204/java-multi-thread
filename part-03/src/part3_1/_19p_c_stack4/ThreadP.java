package part3_1._19p_c_stack4;

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
            p.pushService();
        }
    }
}
