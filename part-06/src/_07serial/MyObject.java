package _07serial;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/7 22:39
 **/
public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {}

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法");
        return MyObjectHandler.myObject;
    }
}
