package com.neusoft.homework3;

import com.neusoft.homework3.FaShuSkill;
import com.neusoft.homework3.WangZheRole;

/**
 * @author liuboting
 * @date 2020/6/14 18:27
 */

public class InnerDemoTest5 {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();

        // 设置角色法术技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("发射爱心");
            }
        });
        role.faShuSkillAttack();

        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("发射激光");
            }
        });
        role.faShuSkillAttack();
    }
}
