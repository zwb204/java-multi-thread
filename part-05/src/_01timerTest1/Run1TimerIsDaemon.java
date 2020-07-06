package _01timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * 将创建的Timer改成守护线程
 * 程序运行结束后迅速结束当前的进程，并且TimerTask中的任务不再被运行，因为进程已经结束了。
 * @Author: zwb
 * @CreateTime: 2020/7/4 16:31
 **/
public class Run1TimerIsDaemon {

    private static Timer timer = new Timer(true);

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
//            Thread.sleep(1000);
            timer.schedule(task,date);
        } catch (ParseException /*| InterruptedException*/ e) {
            e.printStackTrace();
        }
    }
}
