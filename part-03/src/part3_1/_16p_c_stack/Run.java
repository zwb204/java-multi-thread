package part3_1._16p_c_stack;

/**
 * @Desc:
 * 一生产者一消费者：操作栈
 *
 * @Author: zwb
 * @CreateTime: 2020/6/28 13:33
 **/
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
