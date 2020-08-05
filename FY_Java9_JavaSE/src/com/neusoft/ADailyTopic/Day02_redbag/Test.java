package com.neusoft.ADailyTopic.Day02_redbag;

import com.neusoft.day16.Animal;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/31 8:34
 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入红包金额：");
        int totalMoney = scanner.nextInt();
        System.out.println("请输入数量：");
        int count = scanner.nextInt();
        Manager manager = new Manager("冤大头", 500);
        ArrayList<Integer> list = manager.sendRedBag(200, 3);
        Member member1 = new Member("白嫖怪1", 0);
        Member member2 = new Member("白嫖怪2", 0);
        Member member3 = new Member("白嫖怪3", 0);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        manager.showMessage();
        member1.showMessage();
        member2.showMessage();
        member3.showMessage();
    }
}
