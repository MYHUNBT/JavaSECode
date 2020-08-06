package com.neusoft.jdbc;

import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author liuboting
 * @date 2020/8/6 14:41
 */

public class JDBCDemoSql {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtils.getConnection();
            String sql = "update account set balance = balance + ? where id = ?";
            String sql2 = "update account set balance = balance - ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement.setInt(1,500);
            preparedStatement.setInt(2,1);
            preparedStatement2.setInt(1,500);
            preparedStatement2.setInt(2,2);

            int count = preparedStatement.executeUpdate();
            int count2 = preparedStatement2.executeUpdate();
            System.out.println("count:" + count + "  count2:" + count2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
            JDBCUtils.close(preparedStatement2,null);
        }
    }
}
