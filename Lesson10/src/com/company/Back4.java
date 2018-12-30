package com.company;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Back4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число переменных:");
        int n = scan.nextInt();
        int[] arr = new int[n];//массив на n элементов
        int i = 0;
        //заполнение в цикле всех ячеек массива
        while (i < n) {
            arr[i] = scan.nextInt();
            i = i + 1;
        }

        //вывод на экран всех значений в массиве в обратном порядке
        int c = n - 1;
        while (c >= 0) {
            System.out.println(arr[c]);
            c = c - 1;
        }
    }
}









