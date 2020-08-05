package day10;

/**
 * @author liuboting
 * @date 2020/7/24 10:20
 */

public class Demo04 {
    public static void main(String[] args) {
        /*//绝对值
        double d1 = Math.abs(-5);
        //返回大于等于参数的最小整数
        double ceil = Math.ceil(3.3);
        double floor = Math.floor(-3.3);
        double round = Math.round(5.5);
        double pi = Math.PI;
        System.out.println(floor);*/
        // 计算-10.8到5.9 之间，绝对值大于6小于2.1的整数有多少个
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (double i = Math.ceil(min); i <= Math.floor(max); i++) {
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println(count);
    }
}
