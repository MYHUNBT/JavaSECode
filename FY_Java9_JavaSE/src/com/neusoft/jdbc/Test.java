package com.neusoft.jdbc;

/**
 * @author liuboting
 * @date 2020/8/6 11:33
 */

public class Test {
    public static void main(String[] args) {
        String username = "张三";
        String password = "123";
        String sql = "select * from user where username = '"+ username + "'";
        System.out.println(sql);
    }
}
