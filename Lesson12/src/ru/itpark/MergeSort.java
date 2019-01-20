package ru.itpark;


public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 1, 9, 4, 5, 6};
    }

    static void sort(int[] arr) {
        int n = arr.length;
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
    }
}
