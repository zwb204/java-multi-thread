package part3_2._02joinTest2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:18
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
