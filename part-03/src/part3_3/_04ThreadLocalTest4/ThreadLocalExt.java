package part3_3._04ThreadLocalTest4;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/1 10:20
 **/
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再为null";
    }
}
