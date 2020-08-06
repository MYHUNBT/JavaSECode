package com.neusoft.jdbc;

import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/6 11:05
 */

public class JDBCLoginDemo {
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
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtils.getConnection();
            String sql = "select * from user where username = '" + userName + "'" + "and password ='" + passWord + "';";
            System.out.println(sql);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
