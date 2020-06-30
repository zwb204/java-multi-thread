package part3_1._21pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 14:11
 **/
public class WriteData {

    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write:");
            for (int i = 0;i<300;i++) {
                String outData = "" + (i+1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
