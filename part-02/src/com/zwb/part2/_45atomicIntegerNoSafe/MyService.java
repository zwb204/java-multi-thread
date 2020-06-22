package com.zwb.part2._45atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 14:38
 **/
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    public synchronized void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
