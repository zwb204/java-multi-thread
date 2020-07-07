package _02singleton_2;

/**
 * @Desc:
 * 延迟加载（懒汉模式）多线程下多实例，通过synchronized解决
 * 但效率低下，下一个线程想要取得对象，必须等上一个线程释放锁。
 *
 * @Author: zwb
 * @CreateTime: 2020/7/6 15:38
 **/
public class MyObject {
    private static MyObject myObject;

    private MyObject() {}

    public static synchronized MyObject getInstance() {
        try {
            //延迟加载
            if (myObject != null) {

            } else {
                //模拟在创建对象前做一些准备工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return  myObject;
    }
}
