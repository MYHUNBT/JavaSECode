package com.neusoft.jdbc.utils;

import com.neusoft.jdbc.JDBCLoginDemo;

import java.sql.*;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/6 14:31
 */

public class JDBCLoginDemo2 {
    public static void main(String[] args) {
        // 键盘录入，接受用户名和密码、
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = scanner.nextLine();
        System.out.println("请输入密码:");
        String passWord = scanner.nextLine();
        //编写一个方法Login 判断用户 用户名密码是否正确
        boolean flag = new JDBCLoginDemo().login(userName, passWord);
        if(flag){
            System.out.println("登录成功！");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    public boolean login(String userName,String passWord){
        // 判断是否为空
        if(userName == null || passWord == null){
            return false;
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,passWord);
            preparedStatement.executeQuery();
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection,resultSet);
        }
        return false;
    }
}
