package com.hongYan3;

public abstract class Dodge {
    final int df= 10;//初始防御值
    public Dodge next;//下一级
    public abstract void dodgeEnemy(Enemy enemy);
    public void setNext(Dodge next){
        this.next = next;
    }
    public Dodge getNext(){return this.next;}
}
