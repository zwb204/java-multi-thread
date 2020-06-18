package com.zwb.part2._09throwExceptionNoLock;

/**
 * @Desc:
 *线程a出现异常并释放锁，线程b进入方法正常打印，
 * 结论：当一个线程执行的代码出现异常时，其持有的锁会被自动释放
 * @Author: zwb
 * @CreateTime: 2020/6/18 14:21
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
