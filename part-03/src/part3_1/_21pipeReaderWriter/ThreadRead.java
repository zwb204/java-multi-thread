package part3_1._21pipeReaderWriter;


import java.io.PipedReader;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 15:43
 **/
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
