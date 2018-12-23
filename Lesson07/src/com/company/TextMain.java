package com.company;

public class TextMain {
    public static void main(String[] args) {
        TextAnalyzer ta = new TextAnalyzer();
        double c = ta.analyze(
                "Подарки на Новый год, подарки!",
                "Праздник Новый год.");
        System.out.println(c);
    }
}
