package ru.itpark;

public class CharArray {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'p'};
        String s = String.valueOf(arr);
        System.out.println(s);

        String stroka = "привет";
        char[] symbols = stroka.toCharArray();
        System.out.println(symbols[2]);
    }
}
