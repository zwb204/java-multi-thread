package part3_2._03joinException;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:27
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程b在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程b在catch处打印了");
            e.printStackTrace();
        }
    }
}
