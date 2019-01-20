package ru.itpark;

public class Function {
    public static void main(String[] args) {
        int x = sum(5, 6);
        System.out.println(x);
        System.out.println(sum(5, 6, 4));
    }

    //функция
    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    static int sum(int a, int b, int c) {
        int s = a + b + c;
        return s;
    }
}
