package com.company;

import java.util.ArrayList;

public class TextAnalyzer {
    double analyze(String text1, String text2) {
        ArrayList<String> words1 = preprocess(text1);
        ArrayList<String> words2 = preprocess(text2);
        int count = 0;//количество слов, которые есть в обоих текстах
        for (int i = 0; i < words1.size(); i++) {
            String word = words1.get(i);
            if (words2.contains(word)) {
                count++;
            }
        }
        int n1 = words1.size();
        int n2 = words2.size();
        return 100 * (double) count / (n1 + n2 - count);
    }

    ArrayList<String> preprocess(String text) {
        text = text.replace(",", "");//удаление всех запятых
        text = text.replace(".", "");
        text = text.replace("!", "");
        text = text.toLowerCase();//получение той же строки, записанной маленькими буквами
        String[] words = text.split(" ");
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean b = uniqueWords.contains(word);
            if (b == false) {
                uniqueWords.add(words[i]);
            }
        }
        return uniqueWords;
    }
}
