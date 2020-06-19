package com.neusoft.homework4;

/**
 * @author liuboting
 * @date 2020/6/14 20:18
 */

public class Student {
    String name;
    boolean attendance = true;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
}
