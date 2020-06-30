package part3_1._22wait_notify_insert_test;

/**
 * @Desc:
 * 线程A和B 交替备份
 *
 * @Author: zwb
 * @CreateTime: 2020/6/30 14:37
 **/
public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0;i < 20;i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }

}
