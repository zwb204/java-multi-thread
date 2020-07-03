package part4_1._10lockMethodTest1;

/**
 * @Desc:
 * getHoldCount()的作用是查询当前线程保持此锁定的个数，也就是调用lock()方法的次数
 * @Author: zwb
 * @CreateTime: 2020/7/2 14:25
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
        System.out.println(service.lock.getHoldCount());
    }
}
