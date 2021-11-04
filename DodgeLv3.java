package com.hongYan3;

public class DodgeLv3 extends Dodge {
    @Override
    public void dodgeEnemy(Enemy enemy) {
        if (enemy.getATK() > df) {
            System.out.println("王子躲避此次攻击，尝试进行反击");
            enemy.attacked();
        } else {
            next.dodgeEnemy(enemy);
        }
    }
}