package com.neusoft.jdbc;

import java.sql.*;

/**
 * @author liuboting
 * @date 2020/8/5 9:22
 */

public class JDBCDemo5 {
    //查询
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9",
                    "root",
                    "root");
            System.out.println(connection);
            statement = connection.createStatement();
            String sql = "select * from account;";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int balance = resultSet.getInt("balance");
                System.out.println("id: " + id + " name: " + name + " balance: " + balance);
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
            if(resultSet != null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
