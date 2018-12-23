package com.company.human;

public class SuperMan extends Human {
    public SuperMan(int initialWeight) {
        super(initialWeight);
        System.out.println("Я супермен");
    }

    public void programming() {
        System.out.println("Что-то программирую");
        System.out.println("Но ничего не работает");
    }
}
