package com.hongYan3;

public class Demo {
    public static void main(String[] args) {
        DodgeLv1 dodgeLv1 = new DodgeLv1();
        DodgeLv2 dodgeLv2 = new DodgeLv2();
        DodgeLv3 dodgeLv3 = new DodgeLv3();
        DodgeLv4 dodgeLv4 = new DodgeLv4();
        dodgeLv1.setNext(dodgeLv2);
        dodgeLv2.setNext(dodgeLv3);
        dodgeLv3.setNext(dodgeLv4);

        Enemy enemy1 = new Enemy(5);
        enemy1.attack(dodgeLv1);
        System.out.println("-------------------------");
        Enemy enemy2 = new Enemy(15);
        enemy2.attack(dodgeLv1);
        System.out.println("-------------------------");

        Enemy enemy3 = new Enemy(25);
        enemy3.attack(dodgeLv1);
        System.out.println("-------------------------");

        Enemy enemy4 = new Enemy(35);
        enemy4.attack(dodgeLv1);
    }
}
