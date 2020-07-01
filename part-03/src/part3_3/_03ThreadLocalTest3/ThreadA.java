package part3_3._03ThreadLocalTest3;

import java.util.Date;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:52
 **/
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0;i < 20;i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("A " + Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
