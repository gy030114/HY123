package com.hongYan3;

public class DodgeLv1 extends Dodge{
    @Override
    public void dodgeEnemy(Enemy enemy) {
        if(enemy.getATK() > 3*df){
            System.out.println("王子逃跑");
        }else{
            next.dodgeEnemy(enemy);
        }
    }
}
