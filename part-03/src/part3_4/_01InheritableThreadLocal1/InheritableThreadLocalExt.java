package part3_4._01InheritableThreadLocal1;

import java.util.Date;

/**
 * @Desc:
 * InheritableThreadLocal类可以让子线程从父线程中取得值
 *
 * @Author: zwb
 * @CreateTime: 2020/7/1 10:39
 **/
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
