package com.company;//путь до данного java-файла от src

import java.util.Scanner;

public class MyCalculator {
    //psvm
    public static void main(String[] args) {
        int x;//объявление целочисленной переменной
        x = 6;//присвоение значения 6
        //обявление переменной типа сканнер (умеет считывать данные)
        Scanner scanner;
        //инициализация переменной новым сканером, считывающим из консоли
        scanner = new Scanner(System.in);
        //sout
        System.out.println("Введите первое число:");
        x = scanner.nextInt();//программа ждет ввода некоторого числа. Полученное число записывается в x
        System.out.println("Введите второе число:");
        int y = scanner.nextInt();
        System.out.println("Введите действие (+, -, *, /, ^):");
        String a = scanner.next();
        //НЕВЕРНО! Нельзя строки сравнивать через ==
//        if (a == "+") {
//            System.out.println(x + y);
//        }
        if (a.equals("+")) {
            System.out.println(x + y);
        }
        if (a.equals("-")) {
            System.out.println(x - y);
        }
        if (a.equals("^")) {
            int c = 0;
            int result = 1;
            while (c < y) {
                result = result * x;
                c = c + 1;
            }
            System.out.println(result);
        }

    }
}
