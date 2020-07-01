package part3_3._02ThreadLocalTest2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:46
 **/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0;i < 100;i++) {
                Tools.t1.set("Main" + (i+1));
                System.out.println("Main get Value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
