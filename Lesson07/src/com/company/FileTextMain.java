package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTextMain {
    public static void main(String[] args) throws FileNotFoundException {
        TextAnalyzer ta = new TextAnalyzer();
        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");
        String text1 =getText(f1);
        String text2 =getText(f2);
        System.out.println(ta.analyze(text1, text2));
    }

    static String getText(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        String text = "";
        while (sc.hasNextLine()) {
            text = text + sc.nextLine();
        }
        return text;
    }

}
