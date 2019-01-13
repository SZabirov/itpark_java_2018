import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        int n = 100000000;
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int x = r.nextInt(1000000);
            arr[i] = x;
        }
        long start = System.nanoTime();
        Arrays.sort(arr);
        long end = System.nanoTime();
        System.out.println(end - start);
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
