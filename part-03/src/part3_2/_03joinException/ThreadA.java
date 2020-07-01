package part3_2._03joinException;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:24
 **/
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0;i < Integer.MAX_VALUE;i++) {
            String newString = new String();
            Math.random();
        }
    }
}
