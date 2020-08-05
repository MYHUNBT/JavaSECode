package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author liuboting
 * @date 2020/8/5 9:15
 */

public class JDBCDemo4 {
    public static void main(String[] args)  {
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9",
                    "root",
                    "root");
            System.out.println(connection);
            String sql = "delete from account where id = 4";

            statement = connection.createStatement();

            int count = statement.executeUpdate(sql);
            System.out.println();

            if (count>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException E){
            E.printStackTrace();
        }finally {
            // 释放资源
            if(statement != null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
