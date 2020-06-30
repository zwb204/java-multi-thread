package part3_1._20pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Desc:
 * 通过管道进行线程间通信：字节流
 * 使用outputStream.connect(inputStream);或inputStream.connect(outputStream);的作用使
 * 两个Stream之间产生通信链接，这样才可以将数据进行输入和输出。
 *
 * @Author: zwb
 * @CreateTime: 2020/6/30 9:50
 **/
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

//            inputStream.connect(outputStream);
            outputStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
