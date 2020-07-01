package part3_2._07joinTest3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:00
 **/
public class RunFirst {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);

        a.start();
        b.start();

        System.out.println("    main end=" + System.currentTimeMillis());
    }
}
