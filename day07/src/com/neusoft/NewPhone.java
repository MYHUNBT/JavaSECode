package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 15:11
 */

public class NewPhone extends Phone{
    //重写父类的来电显示功能，并且增加自己的的显示姓名和图片功能
    @Override
    public void showNum(){
        //调用父类已经存在的功能使用super
        super.showNum();
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}
