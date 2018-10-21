package com.company;

import java.util.Arrays;

/**
 * Есть массив из n чисел
 * Отсортировать числа в массиве по возрастанию
 * Вывести элементы массива на экран
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};
        int[] arr2 = {4, 7, 2, 9, 2, 4};
        int[] arr3 = {6, 7, 2, 9, 2, 7, 56,};
        sortArray(arr);
        sortArray(arr2);
        sortArray(arr3);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArray(int[] arr) {
        int n = arr.length;//возвращает число элементов в массив
        for (int j = 0; j < n - 1; j++) {
            int indexOfMax = 0;
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[indexOfMax]) {
                    indexOfMax = i;
                }
            }
            int b = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - j];
            arr[n - 1 - j] = b;
        }
    }
}
