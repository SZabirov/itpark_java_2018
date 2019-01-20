package ru.itpark;

public class RecursionNumberSum {
    public static void main(String[] args) {

    }

    //посчитать сумму от 1 до n
    //без использования циклов
    static int numberSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            int s = n + numberSum(n - 1);
            return s;
        }
    }
}
