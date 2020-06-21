package com.zwb.part2._20syn_out_asyn2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/19 16:27
 **/
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data) {
//        try {
//            if (list.getSize() < 1) {
//                Thread.sleep(2000);
//                list.add(data);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return list;

        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
