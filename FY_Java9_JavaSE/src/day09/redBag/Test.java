package day09.redBag;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/7/24 19:16
 */

public class Test {
    public static void main(String[] args) {
        Member memberOne = new Member("张三",0);
        Member memberTwo = new Member("李四",0);
        Member memberThree = new Member("王五",0);
        Manger manger = new Manger("冤大头", 500);
        ArrayList<Integer> send = manger.send(200, 3);
        memberOne.receive(send);
        memberTwo.receive(send);
        memberThree.receive(send);
        manger.show(manger.getUserName());
        memberOne.show(memberOne.getUserName());
        memberTwo.show(memberTwo.getUserName());
        memberThree.show(memberThree.getUserName());
    }
}
