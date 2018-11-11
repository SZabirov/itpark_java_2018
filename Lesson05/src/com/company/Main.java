package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] points = {100, 250, 500, 1500, 3000};
        String[] sectors = {"+", "Приз"};
        String question = "Назовите единицу измерения " +
                "информации, равную 8 битам";
        String answer = "байт";
        System.out.println(question);
        String s = "****";
        int pNum = points.length;
        int sNum = sectors.length;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (s.contains("*")) {
            System.out.println(s);
            System.out.print("Крутите барабан (нажмите Enter):");
            sc.nextLine();
            int index = r.nextInt(pNum + sNum);
            if (index < pNum) {
                System.out.println("На барабане " +
                        points[index] + " очков");
                System.out.println("Назовите букву:");
                String letter = sc.nextLine();
                char c = letter.charAt(0);
                for (int i = 0; i < answer.length(); i++) {
                    char x = answer.charAt(i);
                    if (x == c) {
                        s = s.substring(0, i) +
                                c + s.substring(i + 1);
                        sum = sum + points[index];
                    }
                }
            } else {
                System.out.println("Сектор " +
                        sectors[index - pNum] + " на барабане");
                if (index - pNum == 0) {//если Сектор +
                    System.out.println("Введите номер буквы:");
                    int num = sc.nextInt();
                    char c = answer.charAt(num - 1);
                    for (int i = 0; i < answer.length(); i++) {
                        char x = answer.charAt(i);
                        if (x == c) {
                            s = s.substring(0, i) +
                                    c + s.substring(i + 1);
                        }
                    }
                }
            }
        }
        System.out.println("Вы выиграли!!!");
        System.out.println("Это слово: " + answer);
        System.out.println("Вы набрали " + sum + " очков");
    }
}







