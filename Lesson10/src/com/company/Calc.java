package com.company;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int c = 0;
        int result = 1;
        while (c < y) {
            result = result * x;
            c = c + 1;
        }
        System.out.println(result);
    }
}
