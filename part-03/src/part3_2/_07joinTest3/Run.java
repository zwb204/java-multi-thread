package part3_2._07joinTest3;

 /**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 22:48
 **/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("        main end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
