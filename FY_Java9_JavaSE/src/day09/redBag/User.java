package day09.redBag;

/**
 * @author liuboting
 * @date 2020/7/24 19:16
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

    public void show(String userName){
        System.out.println("姓名：" + userName + ",剩余的钱：" + leftMoney);
    }
}
