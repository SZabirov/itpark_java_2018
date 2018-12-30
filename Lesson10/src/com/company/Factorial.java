package com.company;

//Факториал - произведение чисел от 1 до n
//Например: факториал от 4 = 1 * 2 * 3 * 4
//f = 1;
//f = f * 1 = 1
//f = f * 2 = 2
//f = f * 3 = 6
//f = f * 4 = 24
//Например: факториал от 6 = 1 * 2 * 3 * 4 * 5 * 6
public class Factorial {
    public static void main(String[] args) {
        int t = fact(6);
        System.out.println(t);
    }

    static int fact (int chislo) {
        int f = 1;
        int c = 1;
        while (c <= chislo) {
            f = f * c;
            c = c + 1;
        }
        return f;
    }

}
