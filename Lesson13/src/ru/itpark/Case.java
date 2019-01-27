package ru.itpark;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите англ. букву");
        char c = sc.next().charAt(0);
        if (c >= 'a' & c <= 'z') {
            char up = (char) (c - 32);
            System.out.println(up);
        } else {
            if (c >= 'A' & c <= 'Z') {
                char down = (char) (c + 32);
                System.out.println(down);
            } else {
                System.out.println("Это не буква:(");
            }
        }
    }
}
