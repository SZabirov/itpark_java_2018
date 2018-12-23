package com.company.human;

public class Main {
    public static void main(String[] args) {
        Human h = new Human(75);// создали новый объект Human
        h.eat();
        h.eat();
        h.eat();
        Human chelovek = new Human(100);
        chelovek.eat();
        h.eat();
        h.eat();
        System.out.println(h.weight);
        System.out.println(chelovek.weight);
}
}
