package com.zwb.part1._03randomThread;

/**
 * @Desc:
 * start()方法通知线程规划器此线程已经准备就绪，等待调用线程对象的run()方法。
 * 这个过程其实就是让系统安排一个时间来调用Thread中的run方法，也就是使线程得到运行，启动线程，具有异步执行的效果。
 * 如果直接调用run()方法就不是异步执行，而是同步，那么此对象并不交给“线程规划器”来处理，而是由main主线程来调用run()方法，
 * 也就是必须等run()方法中的代码执行完毕后才可以执行后面的代码。
 * @Author: zwb
 * @CreateTime: 2020/6/16 13:52
 **/
public class Test {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0;i<10;i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
