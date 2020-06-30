package part3_1._22wait_notify_insert_test;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 14:28
 **/
public class DBTools {
    private volatile  boolean prevIsA = false;

    public synchronized void backupA() {
        try {
            while (prevIsA == true) {
                wait();
            }
            for (int i = 0;i < 5;i++) {
                System.out.println("++++++++");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void backupB() {
        try {
            while (prevIsA == false) {
                wait();
            }
            for (int i = 0;i<5;i++) {
                System.out.println("********");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
