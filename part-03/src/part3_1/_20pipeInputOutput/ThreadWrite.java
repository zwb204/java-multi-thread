package part3_1._20pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 15:43
 **/
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write,PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
