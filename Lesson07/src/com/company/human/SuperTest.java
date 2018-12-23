package com.company.human;

public class SuperTest {
    public static void main(String[] args) {
        SuperMan sm = new SuperMan(85);
        sm.programming();
        Human h = new Human(100);
        h.eat();
        //Ошибка, так как Human - не SuperMan
        ((SuperMan) h).programming();
    }
}
