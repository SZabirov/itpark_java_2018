import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Иванов");
        list.add("Петров");
        String s0 = list.get(0);
        String s1 = list.get(1);
        list.remove(0);
        System.out.println(list.get(0));
    }
}
