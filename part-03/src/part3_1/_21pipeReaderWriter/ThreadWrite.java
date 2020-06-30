package part3_1._21pipeReaderWriter;


import java.io.PipedWriter;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 15:43
 **/
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write,PipedWriter out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
