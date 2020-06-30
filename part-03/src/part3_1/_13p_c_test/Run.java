package part3_1._13p_c_test;

/**
 * @Desc:
 * 一生产一消费 ：操作值
 *
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:28
 **/
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);
        cThread.start();
        pThread.start();
    }


}
