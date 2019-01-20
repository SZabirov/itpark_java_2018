package ru.itpark;

public class Main {
    //Есть два отсортированных массива,
    //нужно слить элементы обоих массивов
    //в новый массив тоже в отсортированном порядке
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 8, 9};
        int n1 = arr1.length;
        int[] arr2 = {1, 4, 5, 6, 7};
        int n2 = arr2.length;
        int n = n1 + n2;
        int[] arr = new int[n];
        int a = 0;
        int b = 0;
        int i = 0;
        while (a < n1 & b < n2) {
            if (arr1[a] < arr2[b]) {
                arr[i] = arr1[a];
                a++;
                i++;
            } else {
                arr[i] = arr2[b];
                b++;
                i++;
            }
        }
        while (a < n1) {
            arr[i] = arr1[a];
            a++;
            i++;
        }
        while (b < n2) {
            arr[i] = arr2[b];
            b++;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}








