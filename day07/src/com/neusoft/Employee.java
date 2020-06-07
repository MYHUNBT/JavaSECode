package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 14:25
 * 定义员工类作为父类
 */

/*语法结构
        方式1:
        super(当前类名称,self).你要调的父类的属性或方法
        方式2;
        super().你要调的父类的属性或方法
        方式3:
        你要调的父类的属性或方法(self)
*/

public class Employee {
    String name;
    public void work(){
        System.out.println("全心全意地在工作");
    }

}
