package part3_1._19p_c_stack4;

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
