package com.zwb.part2._46synchronizedUpdateNewValue;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 16:16
 **/
public class Service {
    private /*volatile*/ boolean isContinueRun = true;
    public void runMethod() {
        String anyString = new String();
        while (isContinueRun == true) {
            synchronized (anyString){

            }
        }
        System.out.println("停下来了");
    }
    public void stopMethod() {
        isContinueRun = false;
    }
}
