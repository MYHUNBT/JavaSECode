package day09.redBag;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/7/24 19:15
 */

public class Member extends User{

    public Member(String userName,int leftMoney) {
        super(userName,leftMoney);
    }

    public void receive(ArrayList<Integer> arrayList){
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        super.setLeftMoney(super.getLeftMoney() + arrayList.get(index));
        arrayList.remove(arrayList.get(index));
    }
}

