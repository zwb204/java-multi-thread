package _02timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * 该方法的作用是在指定的日期之后，按照指定的间隔周期性的无线循环的执行某一任务
 * @Author: zwb
 * @CreateTime: 2020/7/5 18:28
 **/
public class Run {
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了。时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-07-22 10:22:00";
            Timer timer = new Timer();
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(task,date,4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
