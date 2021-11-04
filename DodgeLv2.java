package com.hongYan3;

public class DodgeLv2 extends Dodge{
    @Override
    public void dodgeEnemy(Enemy enemy) {
        if(enemy.getATK() > 2*df){
            System.out.println("王子挡下一击");
            System.out.println("王子逃跑");
        }else{
            next.dodgeEnemy(enemy);
        }
    }
}
