package day10;

/**
 * @author liuboting
 * @date 2020/7/24 11:13
 */

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }

}
