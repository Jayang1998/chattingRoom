package Dao;

import java.sql.Connection;

public class DBConnection {
    public static Connection connection;
    /**
     * 单例模式
     * @return
     */
    public  static Connection getConnection() {
        if (connection != null) {
            return connection;
        }else {
            get();
            return connection;
        }
    }

    /*
    对get函数进行同步，防止出现同时设置connection的情况
     */
    private synchronized static void get() {
        //TODO
    }
}
