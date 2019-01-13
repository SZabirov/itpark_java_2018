public class Main {
    //сортировка по возрастанию массива из 4-ёх элементов
    public static void main(String[] args) {
        int[] arr = {33, 3, 7, 1, 4};
        int i = 0;
        if (arr[i] > arr[i + 1]) {
            int b = arr[i];//33
            arr[i] = arr[i + 1];//{3, 3, 7, 1}
            arr[i + 1] = b;//{3, 33, 7, 1}
        }
        i = 1;
        if (arr[i] > arr[i + 1]) {
            int b = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = b;
        }//{3, 7, 33, 1}
        i = 2;
        if (arr[i] > arr[i + 1]) {
            int b = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = b;
        }//{3, 7, 1, 33}

        if (arr[0] > arr[1]) {
            int b = arr[0];
            arr[0] = arr[1];
            arr[1] = b;
        }//{3, 7, 1, 33}
        if (arr[1] > arr[2]) {
            int b = arr[1];
            arr[1] = arr[2];
            arr[2] = b;
        }//{3, 1, 7, 33}

        if (arr[0] > arr[1]) {
            int b = arr[0];
            arr[0] = arr[1];
            arr[1] = b;
        }//{1, 3, 7, 33}

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
