package part4_1._04UseConditionWaitNotifyOK;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 9:14
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
