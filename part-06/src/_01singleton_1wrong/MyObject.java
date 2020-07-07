package _01singleton_1wrong;

/**
 * @Desc:
 * 延迟加载（懒汉模式）
 * 延迟就在就是在调用get()方法的时候实例才被创建，常见的方法就是在get()方法中进行new实例化
 * @Author: zwb
 * @CreateTime: 2020/7/6 15:38
 **/
public class MyObject {
    private static MyObject myObject;

    private MyObject() {}

    public static MyObject getInstance() {
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
