package part3_1._12waitOld;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/24 13:25
 **/
public class Add {
    private String lock;
    public Add(String lock) {
        super();
        this.lock = lock;
    }
    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
