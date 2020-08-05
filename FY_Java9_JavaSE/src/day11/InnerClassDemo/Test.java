package day11.InnerClassDemo;

/**
 * @author liuboting
 * @date 2020/7/25 10:28
 */

public class Test {
    public static void main(String[] args) {
//        Person.Heart heart = new Person().new Heart();
        Person p = new Person();
        Person.Heart heart = p.new Heart();
        heart.jump();
        p.setLive(false);
        heart.jump();
    }
}
