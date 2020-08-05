package day11.classMember;

/**
 * @author liuboting
 * @date 2020/7/25 14:24
 */

public class WangZheRole {
    FaShuAttack faShuAttack;

    public void setFaShuAttack(FaShuAttack faShuAttack) {
        this.faShuAttack = faShuAttack;
    }

    //法术攻击
    public void faShuSkillAttack(){
        System.out.println("发动法术攻击");
        faShuAttack.faShuAttack();
        System.out.println("攻击完毕");
    }
}
