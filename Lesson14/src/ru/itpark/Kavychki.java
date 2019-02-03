package ru.itpark;

import java.util.Scanner;

public class Kavychki {
    //Я сказал: "Привет. Я приехал на машине "Волга"". Он ответил: "Hello".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] symbols = str.toCharArray();
        int n = symbols.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            char s = symbols[i];
            if (s == '"') {
                if (x == 0) {
                    symbols[i] = '«';
                    x = 1;
                } else {
                    symbols[i] = '»';
                    x = 0;
                }
            }
        }
        str = String.valueOf(symbols);
        System.out.println(str);
    }
}
