package part4_1._08ConditionTest1;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 10:40
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
