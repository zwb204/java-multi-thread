package part3_1._21pipeReaderWriter;

import java.io.*;

/**
 * @Desc:
 * 通过管道进行线程间通信：字符流
 *
 * @Author: zwb
 * @CreateTime: 2020/6/30 9:50
 **/
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader inputStream = new PipedReader();
            PipedWriter outputStream = new PipedWriter();

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
