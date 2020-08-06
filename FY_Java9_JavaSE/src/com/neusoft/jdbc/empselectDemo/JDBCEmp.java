package com.neusoft.jdbc.empselectDemo;

import com.neusoft.jdbc.empselectDemo.domain.Emp;
import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * @author liuboting
 * @date 2020/8/5 9:48
 */

public class JDBCEmp {
    public static void main(String[] args) {
        // 定义一个方法 查询emp表中所有的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入sql语句:");
        String s = scanner.nextLine().toLowerCase();
        String[] split = s.split(" ");
        ArrayList<Emp> emps = new JDBCEmp().findAll(s);
        if(split[0].equals("select")){
            for(Emp emp:emps){
                System.out.println(emp);
            }
        }
    }
    public ArrayList<Emp> findAll(String s){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Emp> list = new ArrayList<>();
        String sql = s;
        String[] s1 = s.split(" ");
        System.out.println(s1[0]);
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9",
                    "root",
                    "root");
            statement = connection.createStatement();
            if(s1[0].equals("select")){
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    int empno = resultSet.getInt("EMPNO");
                    String ename = resultSet.getString("ENAME");
                    String job = resultSet.getString("JOB");
                    int mgr = resultSet.getInt("MGR");
                    Date hiredate = resultSet.getDate("HIREDATE");
                    int sal = resultSet.getInt("SAL");
                    int comm = resultSet.getInt("COMM");
                    int deptno = resultSet.getInt("DEPTNO");
                    list.add(new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno));
                }
                return list;
            }else if(s1[0].equals("update") || s1[0].equals("delete") || s1[0].equals("insert") || s1[0].equals("create")){
                int count = statement.executeUpdate(sql);
                if(count > 0){
                    System.out.println("操作成功");
                }else {
                    System.out.println("操作失败");
                }
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
        return list;
    }

}
