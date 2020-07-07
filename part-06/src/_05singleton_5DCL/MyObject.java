package _05singleton_5DCL;

/**
 * @Desc:
 * 利用双重检查double-check locking（DCL）解决懒汉模式的多线程问题
 * @Author: zwb
 * @CreateTime: 2020/7/6 17:37
 **/
public class MyObject {
    private volatile static MyObject myObject;

    private MyObject() {}

    //使用双检测机制来解决问题，即保证不需要同步代码的异步执行性
    //又保证了单例的效果
    public static MyObject getInstance() {
        try {
            if (myObject!=null) {

            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
