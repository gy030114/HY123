package com.hongYan3;

public class Enemy {
    private final int ATK;

    public Enemy(int ATK){
        this.ATK = ATK;
    }

    public int getATK(){
        return ATK;
    }

    public void attack(Dodge dodge){
        dodge.dodgeEnemy(this);
    }
    public void attacked(){
        System.out.println("反击成功");
    }
}
