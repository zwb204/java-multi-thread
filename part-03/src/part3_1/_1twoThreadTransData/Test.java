package part3_1._1twoThreadTransData;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 17:23
 **/
public class Test {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
