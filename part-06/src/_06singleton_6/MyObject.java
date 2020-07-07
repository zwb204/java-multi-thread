package _06singleton_6;

/**
 * @Desc:
 * //内部类方式
 * @Author: zwb
 * @CreateTime: 2020/7/7 22:21
 **/
public class MyObject {
    private static class  MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }
    private MyObject() {}
    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
