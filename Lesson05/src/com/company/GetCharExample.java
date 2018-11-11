package com.company;

public class GetCharExample {
    public static void main(String[] args) {
        String s = "барабан";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }

    }
}
