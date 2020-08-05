package day10.computerDemo;

/**
 * @author liuboting
 * @date 2020/7/24 16:40
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        USB mouse = new Mouse();
        computer.useUSB(mouse);
        computer.shutDown();
    }
}
