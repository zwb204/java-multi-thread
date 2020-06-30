package part3_1._12waitOld;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/24 13:35
 **/
public class Subtract {
    private String lock;
    public Subtract(String lock) {
        super();
        this.lock = lock;
    }
    public void subtract() {
        try {
            synchronized (lock) {
                while /*if*/ (ValueObject.list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() +" begin wait");
                    lock.wait();
                    System.out.println(Thread.currentThread().getName() +" end   wait");
                }
                ValueObject.list.remove(0);
                System.out.println("list size=" + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
