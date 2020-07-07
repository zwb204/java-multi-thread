package _09singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Desc:
 * 枚举enum和静态代码块的特性相似，在使用枚举类时，构造方法会被自动调用，也可以利用这个特性实现单例模式
 * @Author: zwb
 * @CreateTime: 2020/7/8 0:23
 **/
public enum  MyObject {
    connectionFactory;
    private Connection connection;
    private MyObject() {
        try {
            System.out.println("调用MyObject的构造方法");
            String url = "jdbc:sqlserver://localhost:3306;databaseName = xxx";
            String username = "zwb";
            String password = "";
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
