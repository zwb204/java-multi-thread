package _02timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/5 19:59
 **/
public class Run2 {
    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("A运行了。时间为：" + new Date());
                Thread.sleep(5000);
                System.out.println("A结束了。时间为：" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 myTask1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataString = "2018-3-28 14:14:14";
            Timer timer = new Timer();
            Date date = sdf.parse(dataString);
            System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(myTask1,date,4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
