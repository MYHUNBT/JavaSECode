package com.neusoft.ADailyTopic.Day02_redbag;

import org.w3c.dom.ls.LSOutput;

/**
 * @author liuboting
 * @date 2020/7/31 8:34
 */

public class User {
    private String userName;
    private int leftMoney;

    public User(String userName, int leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void showMessage(){
        System.out.println("姓名:" + this.getUserName() + ",余额:" + this.getLeftMoney());
    }
}
