package day10.computerDemo;

/**
 * @author liuboting
 * @date 2020/7/24 16:25
 */

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
