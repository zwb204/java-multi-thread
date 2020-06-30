package part3_1._1twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/22 17:11
 **/
public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("高红颜");
    }

    public int size() {
        return list.size();
    }
}
