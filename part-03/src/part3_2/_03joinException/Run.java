package part3_2._03joinException;

/**
 * @Desc:
 * 在join过程中，如果当前线程对象被中断，则当前线程出现异常
 *
 * 方法join()和interrupt()方法如果彼此遇到，则会出现异常。
 *
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:34
 **/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
