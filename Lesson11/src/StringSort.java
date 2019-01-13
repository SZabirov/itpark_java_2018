public class StringSort {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa", "haha", "qwerty", "ab"};
        int n = arr.length;
        for (int j = n - 1; j > 0; j = j - 1) {
            for (int i = 0; i < j; i = i + 1) {
                int n1 = arr[i].length();//длина 1-го слова
                int n2 = arr[i + 1].length();//длина 2-го слова
                if (n1 > n2) {
                    String b = arr[i];
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

