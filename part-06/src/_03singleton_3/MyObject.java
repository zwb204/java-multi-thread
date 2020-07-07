package _03singleton_3;

/**
 * @Desc:
 * 对整个方法内容使用同步代码块
 * @Author: zwb
 * @CreateTime: 2020/7/6 17:22
 **/
public class MyObject {
    private static MyObject myObject;
    private MyObject() {}

    public static MyObject getInstance() {
        try {
            synchronized (MyObject.class) {
                if (myObject != null) {

                } else {
                    //模拟在创建对象之前做一些准备性的工作
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
