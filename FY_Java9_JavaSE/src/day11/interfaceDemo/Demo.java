package day11.interfaceDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/7/25 14:37
 */

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> evenNum = getEvenNum(list);
        System.out.println(evenNum);

    }
    public static List<Integer> getEvenNum(List<Integer> list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if(num % 2 == 0){
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
