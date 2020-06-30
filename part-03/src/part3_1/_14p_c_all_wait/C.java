package part3_1._14p_c_all_wait;

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
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者" + Thread.currentThread().getName() + " waiting了");
                    lock.wait();
                }
                System.out.println("消费者" + Thread.currentThread().getName() + " running了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
