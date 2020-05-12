package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/10 14:57
 */

public class EmpJavaBean {
    //员工姓名
    private String name;
    //工号
    private int jobNumber;
    //职位
    private String position;
    //薪资
    private int salary;
    //编写对应的测试类
    public EmpJavaBean(){
    }
    public EmpJavaBean(String name,int jobNumber,String position,int salary){
        this.name = name;
        this.jobNumber = jobNumber;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
