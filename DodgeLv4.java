package com.hongYan3;

public class DodgeLv4 extends Dodge{
    @Override
    public void dodgeEnemy(Enemy enemy) {
        enemy.attacked();
    }
}
