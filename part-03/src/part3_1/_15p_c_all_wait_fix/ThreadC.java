package part3_1._15p_c_all_wait_fix;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:26
 **/
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
