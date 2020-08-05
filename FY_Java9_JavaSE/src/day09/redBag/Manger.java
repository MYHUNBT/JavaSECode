package day09.redBag;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/24 19:15
 */

public class Manger extends User {
    public Manger(String userName,int leftMoney) {
        super(userName,leftMoney);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(totalMoney > super.getLeftMoney()){
            System.out.println("余额不足");
            return null;
        }
        super.setLeftMoney(super.getLeftMoney() - totalMoney);
        int avg = totalMoney/count;
        for (int i = 0; i < count; i++) {
            if(i == count-1){
                list.add(totalMoney - avg*(count-1));
            }else {
                list.add(avg);
            }
        }
        return list;
    }
}
