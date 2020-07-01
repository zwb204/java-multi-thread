package part3_3._04ThreadLocalTest4;

/**
 * @Desc:
 * 通过重写initialValue()方法使具有默认值
 *
 * @Author: zwb
 * @CreateTime: 2020/7/1 9:31
 **/
public class Run {

    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
