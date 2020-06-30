package part3_1._4wait_notify_size;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 17:11
 **/
public class MyList {
    private static List list = new ArrayList();

    public static void add() {
        list.add("高红颜");
    }

    public static int size() {
        return list.size();
    }
}
