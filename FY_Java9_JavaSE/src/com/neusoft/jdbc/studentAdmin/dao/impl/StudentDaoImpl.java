package com.neusoft.jdbc.studentAdmin.dao.impl;

import com.neusoft.jdbc.studentAdmin.dao.StudentDao;
import com.neusoft.jdbc.studentAdmin.domain.Student;
import com.neusoft.jdbc.studentAdmin.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/8/6 15:59
 */

public class StudentDaoImpl implements StudentDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public List<Student> findAll() {
        try{
            connection = JDBCUtils.getConnection();
            String sql = "select * from studentmanage";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<Student> students = new ArrayList<>();
            while (resultSet.next()){
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("gender"),
                        resultSet.getInt("score"),
                        resultSet.getString("addr"),
                        resultSet.getString("tel")
                ));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection,resultSet);
        }

        return null;
    }

    @Override
    public void save(Student student) {
        try{
            connection = JDBCUtils.getConnection();
            String sql = "insert into studentmanage values(null,?,?,?,?,?);";
            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getGender());
            preparedStatement.setInt(3,student.getScore());
            preparedStatement.setString(4,student.getAddress());
            preparedStatement.setString(5,student.getTelephone());
            int count = preparedStatement.executeUpdate();
            if(count > 0){
                System.out.println("保存成功");
            }else {
                System.out.println("保存失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
        }

    }

    @Override
    public void remove(Integer id) {
        try{
            connection = JDBCUtils.getConnection();
            String sql = "delete from studentmanage where id = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int count = preparedStatement.executeUpdate();
            if(count > 0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
        }
    }

    @Override
    public void update(Student student) {
        try{
            connection = JDBCUtils.getConnection();
            String sql = "update studentmanage set score = ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,student.getScore());
            preparedStatement.setInt(2,student.getId());
            int count = preparedStatement.executeUpdate();
            if(count > 0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
        }
    }
}
