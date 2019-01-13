
//{2, 6, 7, 9}
//{1, 4, 5, 8}
//{0, 0, 0, 0, 0, 0, 0, 0}
public class MergeOperation {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6};
        int[] arr2 = {3, 6, 8, 9};
        //нужен массив {1, 3, 3, 4, 5, 6, 8, 9, 9}
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

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}
