package ru.itpark;

public class RecursionFactorial {
    public static void main(String[] args) {
        int x = fact(4);
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            int f = n * fact(n - 1);
            return f;
        }
    }
}
