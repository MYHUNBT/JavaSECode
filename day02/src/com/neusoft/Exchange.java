package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/4/12 15:51
 */
public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小明左手中的牌：");
        int left = scanner.nextInt();
        System.out.println("请输入小明右手中的牌：");
        int right = scanner.nextInt();
        System.out.println("互换前小明手中的纸牌：" + "左手中的纸牌：" + left + "右手中的纸牌：" + right);
        int a = 0;
        a = left;
        left = right;
        right = a;
        System.out.println("互换后小明手中的纸牌：" + "左手中的纸牌：" + left + "右手中的纸牌：" + right);
    }
}
