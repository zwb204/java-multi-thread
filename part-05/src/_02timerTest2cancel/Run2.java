package _02timerTest2cancel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * Timer类中的cancel()方法的作用是将任务队列中的全部任务清空
 * @Author: zwb
 * @CreateTime: 2020/7/5 20:48
 **/
public class Run2 {
    private static Timer timer = new Timer();
    public static class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了。时间为：" + new Date());
            timer.cancel();
        }
    }
    public static class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("B运行了。时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA myTaskA = new MyTaskA();
            MyTaskB myTaskB = new MyTaskB();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2015-05-25 06:05:18";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(myTaskA,date,4000);
            timer.schedule(myTaskB,date,4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
