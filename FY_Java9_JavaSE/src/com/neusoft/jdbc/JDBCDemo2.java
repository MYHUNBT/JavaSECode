package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author liuboting
 * @date 2020/8/5 8:58
 */

public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException {
        //        3、获取数据库连接对象 Connection
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java9",
                "root",
                "root");
        System.out.println(connection);
//        4、定义sql
        String sql = "insert into account(name,balance) values ('李四',1000)";
//        5、获取执行sql语句的对象 Statement
        Statement statement = connection.createStatement();
//        6、执行sql，接受返回结果
        int count = statement.executeUpdate(sql);
        System.out.println();
//        7、处理结果
        if (count>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
//        8、释放资源
        statement.close();
        connection.close();
    }
}
