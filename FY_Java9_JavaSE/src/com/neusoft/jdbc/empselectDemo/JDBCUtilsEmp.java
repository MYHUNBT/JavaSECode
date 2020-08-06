package com.neusoft.jdbc.empselectDemo;

import com.neusoft.jdbc.empselectDemo.domain.Emp;
import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/6 9:47
 */

public class JDBCUtilsEmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入SQL语句：");
        String line = scanner.nextLine().toLowerCase();
        List<Emp> emps = new JDBCUtilsEmp().findAllUseJDBCUtils(line);
        if(line.split(" ")[0].equals("select")){
            for(Emp emp:emps){
                System.out.println(emp);
            }
        }
    }
    // 演示JDBCUtils
    public List<Emp> findAllUseJDBCUtils(String sql){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Emp> list = new ArrayList<>();
        try{
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            if(sql.split(" ")[0].equals("select")){
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    list.add(new Emp(
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
                return list;
            }else{
                int count = statement.executeUpdate(sql);
                if(count > 0){
                    System.out.println("操作成功");
                }else {
                    System.out.println("操作失败");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(statement,connection,resultSet);
        }
        return null;
    }
}
