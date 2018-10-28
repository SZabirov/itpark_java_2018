package com.company.pets;

public class PetMaster {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.name = "Tuzik";
        p.age = 3;
        p.height = 100;
        p.hello();
        p.fight();
        p.fight();
        p.fight();
        System.out.println(p.height);
    }
}
