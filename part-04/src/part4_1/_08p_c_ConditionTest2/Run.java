package part4_1._08p_c_ConditionTest2;

import part4_1._01ReentrantLockTest.MyThread;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/2 10:40
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] threadA = new ThreadA[10];
        ThreadB[] threadB = new ThreadB[10];
        for (int i = 0;i<10;i++) {
            threadA[i] = new ThreadA(service);
            threadB[i] = new ThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
