package part3_3._05ThreadLocalTest5;

/**
 * @Desc:
 * 子线程和父线程各自有各自的值
 *
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:56
 **/
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0;i<10;i++) {
                System.out.println("    在main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
