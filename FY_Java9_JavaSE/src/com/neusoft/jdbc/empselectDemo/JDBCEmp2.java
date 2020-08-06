package com.neusoft.jdbc.empselectDemo;

import com.neusoft.jdbc.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/5 11:11
 */

public class JDBCEmp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入SQL语句：");
        String s = scanner.nextLine().toLowerCase();
        ArrayList<Emp> emps = new JDBCEmp2().updateDatabase(s);
        String[] split = s.split(" ");
        if(split[0].equals("select")){
            for(Emp emp:emps){
                System.out.println(emp);
            }
        }

    }
    public ArrayList<Emp> updateDatabase(String s){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = s;
        ArrayList<Emp> emps = new ArrayList<>();
        String[] strings = s.split(" ");
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9", "root", "root");
            statement = connection.createStatement();
            if(strings[0].equals("select")){
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    emps.add(new Emp(
                            resultSet.getInt("empno"),
                            resultSet.getString("ename"),
                            resultSet.getString("job"),
                            resultSet.getInt("mgr"),
                            resultSet.getDate("hiredate"),
                            resultSet.getInt("sal"),
                            resultSet.getInt("comm"),
                            resultSet.getInt("deptno")
                            ));
                }
                return emps;
            }else{
                int count = statement.executeUpdate(sql);
                if(count > 0){
                    System.out.println("操作成功");
                }else {
                    System.out.println("操作失败");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassCastException E){
            E.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(statement != null){
                try{
                    statement.close();
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
        return null;
    }
}
