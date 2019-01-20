package ru.itpark;

public class PrintNumbers {
    public static void main(String[] args) {
        printFromNTo1(15);
        printFrom1ToN(15);
    }

    static void printFromNTo1(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            printFromNTo1(n - 1);
        }
    }


    static void printFrom1ToN(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            printFrom1ToN(n - 1);
            System.out.println(n);
        }
    }
}
