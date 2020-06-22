package com.zwb.part2._44atomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 14:31
 **/
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0;i < 10000;i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
