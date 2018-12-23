package com.company.human;

public class Human {
    int weight;//поле класса - данные об объекте

    //конструктор - блок кода, выполняемый при создании нового объекта
    public Human(int initialWeight) {
        weight = initialWeight;
        System.out.println("Я родился");
    }

    //метод - поведение класса
    public void eat() {
        weight++;
        System.out.println("Ем и толстею)");
    }
}
