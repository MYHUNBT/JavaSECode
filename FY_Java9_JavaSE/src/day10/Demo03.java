package day10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/7/24 10:15
 */

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
