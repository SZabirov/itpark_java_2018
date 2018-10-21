package com.company;

public class FunctionExample {
    public static void main(String[] args) {
        int f = fact(4);
        System.out.println(f);
    }

    static int power(int a, int b) {
        int m = 1;
        for (int i = 0; i < b; i++) {
            m = m * a;
        }
        return m;
    }

    static int fact(int n){
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    //функция, принимает 2 числа, возвращает сумму чисел
    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }


}
