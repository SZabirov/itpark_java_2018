package ru.itpark;

import java.util.Scanner;

/*
Пользователь вводит сумму денег
Вывести на экран информацию о том, какими купюрами и монетами можно выдать данную сумму денег.
Например, ввели 10054
Ответ программы:
2 по 5000
1 по 50
2 монеты по 2
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int s = sc.nextInt();
	    int n5000 = s / 5000;
        System.out.println(n5000 + " шт. 5000-ых");
        s = s - n5000 * 5000;//s % 5000
        int n1000 = s / 1000;
        System.out.println(n1000 + " шт. 1000-ых");
        s = s - n1000 * 1000;
        //...
        int n50 = s / 50;
        System.out.println(n50 + " шт. 50-рублевых");
        s = s - n50 * 50;

    }
}
