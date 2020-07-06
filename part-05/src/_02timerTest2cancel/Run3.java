package _02timerTest2cancel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/6 14:42
 **/
public class Run3 {
    static int i = 0;
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("正常执行了 " + i);
        }
    }

    public static void main(String[] args) {
        while(true) {
            try {
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateString = "2014-10-12 09:08:00";
                Date date = sdf.parse(dateString);
                timer.schedule(task,date);
                timer.cancel();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
