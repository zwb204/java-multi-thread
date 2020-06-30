package part3_1._18p_c_stack3;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 13:29
 **/
public class C {

    private MyStack myStack;

    public C (MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
