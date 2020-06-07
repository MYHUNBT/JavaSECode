package com.neusoft;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/5/31 18:25
 */

public class MainRedPacket {
    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("当前显示群里所有人的余额");
        // 一个群主100，三个成员0，0，0
        Manager manager = new Manager("群主", 100);
        Member member1 = new Member("一号成员", 0);
        Member member2 = new Member("二号成员", 0);
        Member member3 = new Member("三号成员", 0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("============");
        System.out.println("请群主输入要发红包的金额"); //20  //8，6，6
        int money = new Scanner(System.in).nextInt();
        //发红包
        ArrayList<Integer> list = manager.send(money, 3);
        //收红包
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);

        //显示余额
        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
