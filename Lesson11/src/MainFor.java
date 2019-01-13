public class MainFor {
    //1) сортировка пузырьком чисел по убыванию
    //2) сортировка пузырьком строк по возрастанию их длины
    //{"abc", "a", "ab"} -> {"a", "ab", "abc"}
    public static void main(String[] args) {
//        String[] arr = {"abc", "a", "ab"};
//        String s = "abc"; int n = s.length(); - длина строки s
        int[] arr = {33, 3, 7, 1, 0, 65, 67, 4, 33};
        int n = arr.length;
        for (int j = n - 1; j > 0; j = j - 1) {
            for (int i = 0; i < j; i = i + 1) {
                if (arr[i] > arr[i + 1]) {//чтобы в порядке убывания, заменить знак
                    int b = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = b;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
