package ru.itpark;

import java.util.Scanner;

public class Skobochki {
    //((2+5)-((4+4)*8-8))/7
    //((2+5)-((4+4(*8-8))/7
    //)((2+5)-((4+4*8-8))/7
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] symbols = str.toCharArray();
        int n = symbols.length;
        for (int i = 0; i < n; i++) {
            if (symbols[i] == '(') {
                stack.push(symbols[i]);
            }
            if (symbols[i] == ')') {
                char c = stack.pop();
            }
        }

    }
}
