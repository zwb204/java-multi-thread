package part3_1._20pipeInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 15:43
 **/
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
