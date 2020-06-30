package part3_1._20pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/28 15:32
 **/
public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write:");
            for (int i = 0;i < 300;i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
