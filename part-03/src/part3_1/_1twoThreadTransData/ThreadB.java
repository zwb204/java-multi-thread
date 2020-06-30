package part3_1._1twoThreadTransData;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 17:18
 **/
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size() == 5) {
                    System.out.println("==5了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
