package day11.InnerClassDemo;

/**
 * @author liuboting
 * @date 2020/7/25 10:24
 */

public class Person {
    private boolean live = true;

    class Heart {
        public void jump() {
            if (live) {
                System.out.println("还有一口气");
            } else {
                System.out.println("挂了");
            }
        }
    }

    public boolean isLive(){
        return live;
    }
    public void setLive(boolean live){
        this.live = live;
    }
}
