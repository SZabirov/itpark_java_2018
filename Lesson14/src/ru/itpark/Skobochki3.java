package ru.itpark;

import java.util.Scanner;

public class Skobochki3 {
    //{[(5-0)*(5+8)]-7}*6
    //{[(5-0)*(5+8])-7}*6
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] symbols = str.toCharArray();
        int n = symbols.length;
        for (int i = 0; i < n; i++) {
            if (symbols[i] == '(' | symbols[i] == '[' | symbols[i] == '{') {
                stack.push(symbols[i]);
            }
            if (symbols[i] == ')' | symbols[i] == ']' | symbols[i] == '}') {
                char c = stack.pop();
                if (symbols[i] == ')') {
                    if (c != '(') {
                        System.out.println("Ошибка");
                    }
                }
                if (symbols[i] == ']') {
                    if (c != '[') {
                        System.out.println("Ошибка");
                    }
                }
                if (symbols[i] == '}') {
                    if (c != '{') {
                        System.out.println("Ошибка");
                    }
                }
            }
        }
        if (stack.n != 0) {
            System.out.println("Ошибка");
        }
    }
}
