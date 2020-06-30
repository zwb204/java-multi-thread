package part3_1._12waitOld;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/23 14:45
 **/
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
