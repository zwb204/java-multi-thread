package _09singleton_9;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/6 15:35
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.connectionFactory.getConnection().hashCode());
    }
}
