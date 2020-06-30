package part3_1._14p_c_all_wait;

/**
 * @Desc:
 * 多生产与多消费：操作值-假死
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:16
 **/
public class P {
    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + " waiting了");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + " running了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
