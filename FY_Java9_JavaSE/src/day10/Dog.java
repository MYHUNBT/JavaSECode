package day10;

/**
 * @author liuboting
 * @date 2020/7/24 11:14
 */

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void watchHouse(){
        System.out.println("看家");
    }
}
