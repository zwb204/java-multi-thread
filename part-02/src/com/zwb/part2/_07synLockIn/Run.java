package com.zwb.part2._07synLockIn;

/**
 * @Desc:
 * 关键字synchronized拥有锁重入的功能，也就是在使用synchronized时，当一个线程得到
 * 一个对象锁后，再次请求此对象锁时是可以再次得到该对象的锁的。
 *
 * 在一个synchronized方法/块的内部调用本类的其他synchronized方法/块时，是永远可以得到锁的。
 *
 * 如果不可锁重入的话，就会造成死锁
 *
 * @Author: zwb
 * @CreateTime: 2020/6/18 13:11
 **/
public class Run {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                Service service = new Service();
                service.service1();
            }
        };
        t.start();
    }
}
