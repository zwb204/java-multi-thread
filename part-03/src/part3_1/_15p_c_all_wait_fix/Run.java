package part3_1._15p_c_all_wait_fix;

/**
 * @Desc:
 * 一生产一消费 ：操作值
 *
 * 将P和C的notify()改为notifyAll()，每次不光唤醒同类线程，也唤醒异类线程，就不会假死了。
 *
 * @Author: zwb
 * @CreateTime: 2020/6/25 15:28
 **/
public class Run {

    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];
        for (int i = 0;i<2;i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i+1));
            cThread[i] = new ThreadC(c);
            cThread[i].setName("消费者" + (i+1));
            pThread[i].start();
            cThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0;i < threadArray.length;i++) {
            System.out.println(threadArray[i].getName() + " " +threadArray[i].getState());
        }

    }


}
