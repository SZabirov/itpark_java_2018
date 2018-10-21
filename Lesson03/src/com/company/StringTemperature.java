package com.company;

/**
 * посчитать среднюю температуру за неделю
 * по данным из файла myfile.txt
 */
public class StringTemperature {
    public static void main(String[] args) {
        String s1 = "понедельник 12";
        String s2 = "вторник 14";
        String[] arr1 = s1.split(" ");//разобьет строку на элементы по пробелу
        String t1 = arr1[1];
        int temp1 = Integer.parseInt(t1);//получаем целое число из строки
        String[] arr2 = s2.split(" ");
        String t2 = arr2[1];
        int temp2 = Integer.parseInt(t2);
        int tempSum = temp1 + temp2;
        System.out.println(tempSum);
    }
}
