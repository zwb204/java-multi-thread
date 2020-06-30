package part3_1._17p_c_stack2;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 13:27
 **/
public class P {

    private MyStack myStack;

    public P (MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
