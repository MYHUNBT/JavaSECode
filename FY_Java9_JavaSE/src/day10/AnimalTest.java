package day10;

/**
 * @author liuboting
 * @date 2020/7/24 11:15
 */

public class AnimalTest {
    public static void main(String[] args) {
        //向上转型
        Animal cat = new Cat();
        Animal dog = new Dog();
        //向下转型
        Cat c = (Cat)cat;
        c.catchMouse();
        //为了避免转型发生异常，最好先做个判断
        //变量名 instanceof 数据类型
        if(dog instanceof Animal){
            Dog d = (Dog) dog;
            ((Dog) dog).watchHouse();
        }
//        cat.eat();
//        dog.eat();
        showCatEat(cat);
        showDogEat(dog);
        // 以上两个方法，均可以被showAnimalEat()方法替代
        // 执行效果一致
        //实际的开发过程中，父类类型作为方法的形式参数，传递子类对象给方法，进行方法的调用，更能体现出多态的扩展性和遍历性
        showAnimalEat(cat);
        showAnimalEat(dog);
    }
    public static void showCatEat(Animal cat){
        cat.eat();
    }
    public static void showDogEat(Animal dog){
        dog.eat();
    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }
}
