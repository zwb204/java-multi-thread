package part3_1._17p_c_stack2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/25 16:14
 **/
public class MyStack {
    private List list = new ArrayList();

    public synchronized void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anyString= " +Math.random());
            this.notifyAll();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
                System.out.println("pop操作中的：" + Thread.currentThread().getName() + " WAIT");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
