package part3_4._02InheritableThreadLocal2;

/**
 * @Desc:
 * 值继承：父线程和子线程值相同
 * 可通过childValue()方法修改从父进程继承的值
 * 要注意：如果子进程在取得值的同时，主进程将InheritableThreadLocal中的值修改了，那子进程得到的还是旧值。
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
