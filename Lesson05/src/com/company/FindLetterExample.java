package com.company;

public class FindLetterExample {
    public static void main(String[] args) {
        String s = "барабан";
        char c = 'а';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println("Есть");
            }
        }
    }
}
