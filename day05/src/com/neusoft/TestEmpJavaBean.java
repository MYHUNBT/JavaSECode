package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/10 15:04
 */

public class TestEmpJavaBean {
    public static void main(String[] args) {
        // 无参构造方法的调用
        EmpJavaBean empJavaBean = new EmpJavaBean();
        empJavaBean.setName("刘柏廷");
        empJavaBean.setJobNumber(6666);
        empJavaBean.setPosition("员工");
        empJavaBean.setSalary(8888);
        System.out.println(empJavaBean.getName() + "-" + empJavaBean.getJobNumber() + "-" + empJavaBean.getPosition() + "-" + empJavaBean.getSalary());
        // 有参构造方法的调用
        EmpJavaBean empJavaBean1 = new EmpJavaBean("张三",6666,"员工",8888);
        System.out.println(empJavaBean1.getName() + "-" + empJavaBean1.getJobNumber() + "-" + empJavaBean1.getPosition() + "-" + empJavaBean1.getSalary());
    }
}
