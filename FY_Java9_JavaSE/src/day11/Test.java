package day11;

import com.neusoft.day15.lambadaDemo.Person;

import java.sql.Connection;
import java.util.*;

/**
 * @author liuboting
 * @date 2020/7/25 15:
 * <p>
 * （d8,e1）(d8,e2) (d8,e3) (d8,f1) (d8,f2) (d8,f3)
 */

public class Test {
    public static void main(String[] args) {
        String s = "Hello  World   sda";
        int i = lengthOfLastWord(s);
        System.out.println(i);

    }

    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));
        for (int i = split.length-1; i >= 0; i--) {
            if(!split[i].equals(" ")){
                return split[i].length();
            }
        }
        return 0;
    }
}
