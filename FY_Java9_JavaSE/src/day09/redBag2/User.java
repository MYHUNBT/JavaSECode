package day09.redBag2;

/**
 * @author liuboting
 * @date 2020/7/24 19:16
 */
public class User {
    // 用户名
    private String userName;

    // 余额
    private int leftMoney;

    public User() {
    }

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

    public void show(){
        System.out.println("用户" + userName + "\t"+"余额为" + leftMoney + "元" );
    }
}