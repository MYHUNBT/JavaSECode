package com.neusoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/6/14 20:18
 */

public class Course {
    private String name;
    private Teacher teacher;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    //ArrayList<Student> students
    public void show(List<Student> students,Teacher teacher){
        System.out.println("课程信息：" + this.name + ",老师姓名：" + teacher.getName());
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).isAttendance()){
                System.out.println("上课：" + students.get(i).getName());
            }else{
                System.out.println("旷课：" + students.get(i).getName());
            }
        }
    }
}
