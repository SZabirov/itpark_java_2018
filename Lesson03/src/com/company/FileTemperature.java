package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTemperature {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("myfile.txt");
        Scanner sc = new Scanner(f);
        double tempSum = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int t = getTemperature(s);
            tempSum = tempSum + t;
        }
        double averageTemp = tempSum / 7;
        System.out.println(averageTemp);
    }
    //возвращает температуру в виде числа из строки
    static int getTemperature(String s) {
        String[] arr = s.split(" ");
        String t = arr[1];
        int temp = Integer.parseInt(t);
        return temp;
    }
}
