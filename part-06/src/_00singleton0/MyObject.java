package _00singleton0;

/**
 * @Desc:
 *
 * 立即加载（饿汉模式）线程不安全
 * 缺点是不能有其他实例变量，因为getInstance()方法没有同步，可能会出现线程安全问题
 * @Author: zwb
 * @CreateTime: 2020/7/6 15:28
 **/
public class MyObject {
    //需要由一个静态方法返回实例对象，所以该对象应该为static
    private static MyObject myObject = new MyObject();

    //构造函数为private，这样该类就不会被实例化
    private MyObject() {}

    //静态方法，获取唯一可用的对象
    public static MyObject getInstance() {
        return myObject;
    }
}
