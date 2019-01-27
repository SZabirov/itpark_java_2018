package ru.itpark;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int n = 500000000;
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int x = r.nextInt(1000000);
            arr[i] = x;
        }
        long start = System.nanoTime();
        sort(arr);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    static void sort(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            if (n == 2) {
                if (arr[0] > arr[1]) {
                    int b = arr[1];
                    arr[1] = arr[0];
                    arr[0] = b;
                }
            }
        } else {
            //остаток от деления числа n на 2
            int a = n % 2;//будет 0, если n - четное, будет 1 - в противном случае
            int n1;//число элементов в 1-ом массиве
            int n2;//число элементов во 2-ом массиве
            if (a == 0) {//n - четное число
                n1 = n / 2;
                n2 = n / 2;
            } else {//нечетное кол-во
                n1 = n / 2 + 1;
                n2 = n / 2;
            }
            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];
            for (int i = 0; i < n1; i++) {
                arr1[i] = arr[i];
            }
            for (int i = 0; i < n2; i++) {
                arr2[i] = arr[n1 + i];
            }
            sort(arr1);
            sort(arr2);
            int[] mergedArr = merge(arr1, arr2);
            for (int i = 0; i < n; i++) {
                arr[i] = mergedArr[i];
            }
        }
    }

    static int[] merge(int[] arr1, int[]arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;//кол-во элементов в итоговом массиве
        int[] arr = new int[n];
        int a = 0, b = 0;
        int i = 0;
        while (a < n1 & b < n2) {
            if (arr1[a] < arr2[b]) {
                arr[i] = arr1[a];
                i++;
                a++;
            } else {
                arr[i] = arr2[b];
                i++;
                b++;
            }
        }
        while (a < n1) {
            arr[i] = arr1[a];
            i++;
            a++;
        }
        while (b < n2) {
            arr[i] = arr2[b];
            i++;
            b++;
        }
        return arr;
    }
}
