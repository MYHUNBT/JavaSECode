package com.neusoft.homework3;

/**
 * @author liuboting
 * @date 2020/6/14 18:26
 */

public class WangZheRole {
    private FaShuSkill faShuSkill;

    public FaShuSkill getFaShuSkill() {
        return faShuSkill;
    }

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }

    public void faShuSkillAttack(){
        System.out.println("开始攻击");
        faShuSkill.faShuAttack();
        System.out.println("释放结束");
    }
}
