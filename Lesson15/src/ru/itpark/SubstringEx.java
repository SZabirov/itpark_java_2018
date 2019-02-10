package ru.itpark;

//пример работы с подстрокой
public class SubstringEx {
    public static void main(String[] args) {
        String str = "abcdef";
        int n = str.length();//длина строки
        String s2 = str.substring(0, n - 1);
        System.out.println(s2);
    }
}
