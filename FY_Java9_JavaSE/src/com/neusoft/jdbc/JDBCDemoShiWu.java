package com.neusoft.jdbc;

import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author liuboting
 * @date 2020/8/6 15:05
 */

public class JDBCDemoShiWu {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            String sql = "update account set balance = balance + ? where id = ?";
            String sql2 = "update account set balance = balance - ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement.setInt(1,500);
            preparedStatement.setInt(2,1);
            preparedStatement2.setInt(1,500);
            preparedStatement2.setInt(2,2);

            int count = preparedStatement.executeUpdate();
            // 手动制造异常
            int i = 5/0;

            int count2 = preparedStatement2.executeUpdate();
            System.out.println("count:" + count + "  count2:" + count2);

            //提交事务
            connection.commit();
        } catch (Exception e) {
            try{
                if(connection != null){
                    connection.rollback();
                }
            }catch (SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
            JDBCUtils.close(preparedStatement2,null);
        }
    }
}
