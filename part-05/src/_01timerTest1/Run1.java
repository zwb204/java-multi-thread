package _01timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * 创建一个Timer就是启动一个新的线程
 * timer.schedule(task,date) 在date执行task
 * 若执行任务的时间早于当前时间，则立即执行task任务
 * @Author: zwb
 * @CreateTime: 2020/7/4 16:15
 **/
public class Run1 {

    private static Timer timer = new Timer();

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
            String dateString = "2014-10-12 11:55:00";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(task,date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
