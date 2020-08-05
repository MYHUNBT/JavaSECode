package day11.classMember;

/**
 * @author liuboting
 * @date 2020/7/25 14:27
 */

public class WangZheTest {
    public static void main(String[] args) {
        WangZheRole wangZheRole = new WangZheRole();
        wangZheRole.setFaShuAttack(new FaShuAttack() {
            @Override
            public void faShuAttack() {
                System.out.println("哒哒哒");
            }
        });
        wangZheRole.faShuSkillAttack();
    }
}
