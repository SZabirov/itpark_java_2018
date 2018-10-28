package com.company.pets;

/**
 * Класс Pet - домашнее животное. В полях класса
 * содержится информация о цвете, возрасте и т. д.
 * Методы класса реализуют
 */
public class Pet {
    String color;
    int age;
    String name;
    int height;
    int weight;

    void fight() {
        height = height - 1;
    }

    void hello() {
        System.out.println("Привет, я " + name);
    }

    void eat() {
        System.out.println("Я голоден.");
    }

    void sleep() {
        System.out.println("Доброй ночи! Я спать");
    }
}
