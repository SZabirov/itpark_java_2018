package ru.itpark;

import java.util.Scanner;

public class AlphabetOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String s1 = "hell";
        System.out.println("Введите второе слово");
        String s2 = "hello";
        char[] arr1 = s1.toCharArray();
        int n1 = arr1.length;
        char[] arr2 = s2.toCharArray();
        int n2 = arr2.length;
        int n;//длинна слова, которое короче
        if (n1 > n2) {
            n = n2;
        } else {
            n = n1;
        }
        boolean s1Before = false;
        boolean s2Before = false;
        for (int i = 0;
             i < n & s1Before == false & s2Before == false;
             i++) {
            if (arr1[i] < arr2[i]) {
                s1Before = true;
            } else {
                if (arr1[i] > arr2[i]) {
                    s2Before = true;
                }
            }
        }
        //ниже есть ошибки, исправить (доделать задачу)
        if (s1Before) {
            System.out.println(s1 +
                    " раньше по алфавиту, чем " + s2);
        }
        if (s2Before){
            System.out.println(s2 +
                    " раньше по алфавиту, чем " + s1);
        }
    }
}
