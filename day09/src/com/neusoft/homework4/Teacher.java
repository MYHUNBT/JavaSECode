package com.neusoft.homework4;

/**
 * @author liuboting
 * @date 2020/6/14 20:18
 */

public class Teacher {
    String name;
    Student student;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianMing(Student student) {
        this.student = student;
        student.setAttendance(false);
    }
}
