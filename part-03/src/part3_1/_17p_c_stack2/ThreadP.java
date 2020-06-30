package part3_1._17p_c_stack2;

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
