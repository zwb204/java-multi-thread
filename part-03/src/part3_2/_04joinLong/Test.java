package part3_2._04joinLong;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 15:59
 **/
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000);
//            Thread.sleep(2000);
            System.out.println("  end Timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
