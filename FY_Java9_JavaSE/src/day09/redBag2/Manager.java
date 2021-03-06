package day09.redBag2;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/25 9:16
 */
public class Manager extends User{
    public Manager() {
    }

    public Manager(String userName, int leftMoney) {
        super(userName, leftMoney);
    }

    // 发红包
    public ArrayList<Integer> send(int totalMoney, int count){

        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getLeftMoney();
        // 判断
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
        }
        // 扣钱
        super.setLeftMoney(leftMoney-totalMoney);
        // 每个人发的钱
        int avg = totalMoney/count;
        // 除不开余出来的钱
        int mod = totalMoney%count;

        for (int i = 0; i <count-1 ; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
    }
}

