package _07serial;

import java.io.*;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/7/8 0:11
 **/
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fos = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myObject);
            oos.close();
            fos.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyObject myObject = (MyObject) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
