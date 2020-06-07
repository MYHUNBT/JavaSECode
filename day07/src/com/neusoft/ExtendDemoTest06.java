package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 15:17
 */

public class ExtendDemoTest06 {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        // 调用父类的成员方法
        newPhone.call();
        newPhone.sendMessage();
        //调用子类重写的方法
        newPhone.showNum();
    }
}
