package _01timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * 多个TimerTask任务及延时的测试
 * @Author: zwb
 * @CreateTime: 2020/7/4 16:44
 **/
public class Run2 {

    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("1运行了。时间为：" + new Date());
        }
    }

    public static class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("2运行了。时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String dateString1 = "2014-10-12 11:55:00";
            String dateString2 = "2014-10-12 11:59:00";

            Date date1 = sdf1.parse(dateString1);
            Date date2 = sdf2.parse(dateString2);

            System.out.println("字符串1时间：" + date1.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            System.out.println("字符串2时间：" + date1.toLocaleString() + " 当前时间：" + new Date().toLocaleString());

            timer.schedule(task1,date1);
            timer.schedule(task2,date2);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
