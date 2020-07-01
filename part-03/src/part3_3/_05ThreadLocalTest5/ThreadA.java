package part3_3._05ThreadLocalTest5;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:52
 **/
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0;i < 10;i++) {
                System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
