package ru.itpark;

import java.util.Scanner;

/*
Принимает строку и переводит все сиволы к Верхнему регистру
(пишет ту же строку "капсом")
 */
public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] symbols = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (symbols[i] >= 'a' & symbols[i] <= 'z') {
                symbols[i] = (char) (symbols[i] - 32);
            }
        }
        s = String.valueOf(symbols);
        System.out.println(s);
    }
}
