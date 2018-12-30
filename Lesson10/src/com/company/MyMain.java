package com.company;

public class MyMain {
    public static void main(String[] args) {
        int x = stepen(5, 5);
        int r = sum(1, 5);
        System.out.println(x);
    }

    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    //Функция. Принимает два целых числа: x и y
    //Возвращает x в степени y
    static int stepen(int x, int y) {
        int c = 0;
        int result = 1;
        while (c < y) {
            result = result * x;
            c = c + 1;
        }
        return result;//команда для возвращение результата
    }
}
