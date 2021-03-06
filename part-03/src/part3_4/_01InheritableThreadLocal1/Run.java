package part3_4._01InheritableThreadLocal1;

/**
 * @Desc:
 * 值继承：父线程和子线程值相同
 * @Author: zwb
 * @CreateTime: 2020/7/1 11:11
 **/
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0;i<10;i++) {
                System.out.println("   在Main线程中取值=" + Tools.t1.get());
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
