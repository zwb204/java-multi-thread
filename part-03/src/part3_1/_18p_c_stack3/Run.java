package part3_1._18p_c_stack3;

/**
 * @Desc:
 * 多生产一消费：操作栈
 *
 * @Author: zwb
 * @CreateTime: 2020/6/28 13:33
 **/
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);

        C c = new C(myStack);

        ThreadP threadP1 = new ThreadP(p1);
        ThreadP threadP2 = new ThreadP(p2);
        ThreadP threadP3 = new ThreadP(p3);
        ThreadP threadP4 = new ThreadP(p4);
        ThreadP threadP5 = new ThreadP(p5);

        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();

        ThreadC threadC = new ThreadC(c);

        threadC.start();

    }
}
