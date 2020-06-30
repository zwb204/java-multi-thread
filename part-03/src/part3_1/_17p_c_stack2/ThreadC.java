package part3_1._17p_c_stack2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:24
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
            c.popService();
        }
    }
}
