package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        int x  = countOfProduct("хлеб");
//        System.out.println(x);
        boolean c = exists("булка");
        System.out.println(c);
    }
    /**
     * Возвращает true, если есть запись о таком продукте
     * и количество данного продукта > 0
     */
    static boolean exists(String productName) throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        boolean b = false;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String name = arr[0];
            if (name.equals(productName)) {
                int count = Integer.parseInt(arr[2]);
                if (count > 0) {
                    b = true;
                }
            }
        }
        return b;
    }

    /**
     * Возвращает количество продукта с данным именем
     */
    static int countOfProduct(String productName) throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        int count = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String name = arr[0];
            if (name.equals(productName)) {
                count = Integer.parseInt(arr[2]);
            }
        }
        return count;
    }

    /**
     * Должен вернуть имя самого дорого продукта
     */
    static String mostExpensiveProduct() {
        return "";
    }

    /**
     * Вернет true, если в файле есть продукты с одинаковым именем
     * @return
     */
    static boolean existDuplicates() {
        return false;
    }
}
