package test2;

import test.Father;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 17:43
 **/
public class Son2 extends Father {

    public void aMethod(){
        System.out.println("son2--aMethod");
    }

    protected void bMethod(){
        System.out.println("son2----bMethod");
    }
    public static void main(String[] args) {
        Son2 s = new Son2();
        s.aMethod();
        s.bMethod();
    }

}
