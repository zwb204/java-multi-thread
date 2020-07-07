package _08singleton_8;

/**
 * @Desc:
 * //内部类方式
 * @Author: zwb
 * @CreateTime: 2020/7/7 22:21
 **/
public class MyObject {
    private static MyObject myObject = null;

    private MyObject() {}

    static {
        myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
