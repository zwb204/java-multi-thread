package _02timerTest2cancel;

import _02timerTest2.Run2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * TimerTask的cancel()方法将自身从任务队列中移除
 *
 * @Author: zwb
 * @CreateTime: 2020/7/5 20:14
 **/
public class Run {
    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了。时间为：" + new Date());
            this.cancel();
        }
    }

    public static class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("B运行了。时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 myTask1 = new MyTask1();
            MyTask2 myTask2 = new MyTask2();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataString = "2018-3-28 14:14:14";
            Timer timer = new Timer();
            Date date = sdf.parse(dataString);
            System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(myTask1,date,4000);
            timer.schedule(myTask2,date,4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
