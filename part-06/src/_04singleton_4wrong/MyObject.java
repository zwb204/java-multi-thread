package _04singleton_4wrong;

/**
 * @Desc:
 * 对某些重要的代码内容使用同步代码块，但还是存在线程安全问题
 * @Author: zwb
 * @CreateTime: 2020/7/6 17:22
 **/
public class MyObject {
    private static MyObject myObject;
    private MyObject() {}

    public static MyObject getInstance() {
        try {
            if (myObject != null) {

            } else {
                //模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
