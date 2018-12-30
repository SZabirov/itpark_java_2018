package com.company;

import java.util.Scanner;

//n учеников в группе
//каждый ученик получил некоторое число подарков
//5
//4 2 1 3 1
public class Podarki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько учеников?");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            arr[i] = scan.nextInt();
            i = i + 1;
        }




    }
}
