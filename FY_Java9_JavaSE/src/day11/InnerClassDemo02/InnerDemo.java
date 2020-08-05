package day11.InnerClassDemo02;

/**
 * @author liuboting
 * @date 2020/7/25 11:14
 */

public class InnerDemo {
    public static void main(String[] args) {
        /*
        * 等号左边：是多态赋值，（抽象类）接接口类型引用指向子类对象
        * 等号右边：是匿名内部类 定义并创建该接口的子类对象
        * */
        FlyAble f = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("飞");
            }
        };
        f.fly();
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("飞");
            }
        });
    }
    public static void showFly(FlyAble flyAble){
        flyAble.fly();
    }
}
