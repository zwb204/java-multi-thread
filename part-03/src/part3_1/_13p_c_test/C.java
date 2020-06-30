package part3_1._13p_c_test;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:20
 **/
public class C {
    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值为：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
