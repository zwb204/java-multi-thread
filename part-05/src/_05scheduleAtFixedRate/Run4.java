package _05scheduleAtFixedRate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * 延时
 * @Author: zwb
 * @CreateTime: 2020/7/6 15:10
 **/
public class Run4 {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin。时间为：" + new Date());
                Thread.sleep(1000);
                System.out.println("1   end。时间为：" + new Date());
//                runCount++;
//                if (runCount == 5) {
//                    timer.cancel();
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2020-07-06 15:18:00";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1,date,3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
