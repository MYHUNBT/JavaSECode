package com.neusoft;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/6/14 20:27
 */

public class CourseTest {
    public static void main(String[] args) {
        Student student1 = new Student("小红");
        Student student2 = new Student("小亮");
        Student student3 = new Student("小明");
        Teacher teacher = new Teacher("张老师");
        teacher.setStudent(student3);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Course course = new Course();
        course.setName("Java");
        course.show(students,teacher);
    }
}
