package day11;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/7/25 15:10
 */

public class Test {
    public static void main(String[] args) {
//        short s1 = 1;
//        s1 += 1;
//        s1 = (short) (s1 + 1);
//        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        float d = random.nextFloat();
        float f = random.nextFloat();
        random.setSeed(1);
        System.out.println(d);
        System.out.println(f);
    }
}
