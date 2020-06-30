package part3_1._22wait_notify_insert_test;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/30 14:35
 **/
public class BackupB extends Thread {

    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
