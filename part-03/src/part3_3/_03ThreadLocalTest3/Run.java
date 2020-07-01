package part3_3._03ThreadLocalTest3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:56
 **/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            Thread b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
