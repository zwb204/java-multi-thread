package _04timerTest4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/6 14:47
 **/
public class Run {
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了。时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task1= new MyTask();
        MyTask task2= new MyTask();

        Timer timer1 = new Timer();
//        Timer timer2 = new Timer();
        System.out.println("当前时间：" + new Date().toLocaleString());
        timer1.schedule(task1,7000);
        timer1.schedule(task2,3000,5000);

    }
}
