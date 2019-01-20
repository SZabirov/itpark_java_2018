package ru.itpark;
//факториал числа - произведение
//чисел от 1 до самого числа
//факториал от 5 - это 1*2*3*4*5 = 120
//факториал от 6 - это 1*2*3*4*5*6 = 720
//n!; 5! = 120; 6! = 720;
public class Factorial {
    public static void main(String[] args) {
        int x = pro(5, 7);
        System.out.println(x);
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    static int pro(int a, int b) {
        int p = 1;
        for (int i = a; i <= b; i++) {
            p = p * i;
        }
        return p;
    }
    /*Написать функцию, которая принимает
    * два числа (a, b) и возвращает произведение
    * всех чисел от a до b*/
}
