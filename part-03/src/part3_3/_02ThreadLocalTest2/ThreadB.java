package part3_3._02ThreadLocalTest2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:42
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0;i<100;i++) {
                Tools.t1.set("ThreadB" + (i+1));
                System.out.println("ThreadB get Value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
