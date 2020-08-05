package day09.guessNumber;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

/**
 * @author liuboting
 * @date 2020/7/24 20:07
 */

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(100);
        while(true){
            System.out.println("请输入您猜的数字：");
            Scanner scanner = new Scanner(System.in);
            int guessNumber = scanner.nextInt();
            if(guessNumber == count){
                System.out.println("恭喜您猜对了！！！");
                break;
            }else if(guessNumber > count){
                System.out.println("您猜错的数字大了");
            }else if(guessNumber < count){
                System.out.println("您猜的数字小了");
            }
        }

    }
}
