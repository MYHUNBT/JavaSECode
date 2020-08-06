package com.neusoft.jdbc.studentAdmin;

import com.neusoft.jdbc.studentAdmin.dao.impl.StudentDaoImpl;
import com.neusoft.jdbc.studentAdmin.domain.Student;

import java.util.List;

/**
 * @author liuboting
 * @date 2020/8/6 15:47
 */

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("---- 欢迎登录low版学生管理系统----");
        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("----学生列表----");
        List<Student> students = studentDao.findAll();
        for(Student student:students){
            System.out.println(student);
        }
        System.out.println("----保存学生----");
//        Student student = new Student(2, "李四", "男", 99, "大连", "130555");
//        studentDao.save(student);

        System.out.println("----修改学生----");
//        student.setScore(60);
//        studentDao.update(student);
    }
}
